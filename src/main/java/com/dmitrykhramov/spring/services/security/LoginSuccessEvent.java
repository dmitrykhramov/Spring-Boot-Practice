package com.dmitrykhramov.spring.services.security;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Dmitry on 12.01.2017.
 */

public class LoginSuccessEvent extends ApplicationEvent {

    public LoginSuccessEvent(Object source) {
        super(source);
    }
}
