package com.dmitrykhramov.spring.services.security;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * Created by Dmitry on 12.01.2017.
 */

@Component
public class LoginFailureEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void publish(LoginFailureEvent event){
        this.publisher.publishEvent(event);
    }
}
