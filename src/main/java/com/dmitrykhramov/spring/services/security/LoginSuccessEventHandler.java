package com.dmitrykhramov.spring.services.security;

import com.dmitrykhramov.spring.domain.User;
import com.dmitrykhramov.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

/**
 * Created by Dmitry on 12.01.2017.
 */

@Component
public class LoginSuccessEventHandler implements ApplicationListener<LoginSuccessEvent> {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        Authentication authentication = (Authentication) event.getSource();
        System.out.println("LoginEvent Success for: " + authentication.getPrincipal());
        updateUserAccount(authentication);
    }

    public void updateUserAccount(Authentication authentication){
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        User user = userService.findByUserName(userDetails.getUsername());

        if (user != null) {
            user.setFailedLoginAttempts(0);

            System.out.println("Good login, resetting failed attempts");
            userService.saveOrUpdate(user);
        }
    }
}
