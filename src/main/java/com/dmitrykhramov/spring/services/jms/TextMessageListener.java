package com.dmitrykhramov.spring.services.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by Dmitry on 14.01.2017.
 */

@Component
public class TextMessageListener {

    @JmsListener(destination = "text.messagequeue")
    public void onMessage(String msg){
        System.out.println("###############################");
        System.out.println("###############################");
        System.out.println("I GOT A MESSAGE");
        System.out.println(msg);
        System.out.println("###############################");
        System.out.println("###############################");
    }
}
