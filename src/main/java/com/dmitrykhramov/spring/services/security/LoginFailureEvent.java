package com.dmitrykhramov.spring.services.security;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Dmitry on 12.01.2017.
 */

public class LoginFailureEvent extends ApplicationEvent {

    public LoginFailureEvent(Object source) {
        super(source);
    }
}
