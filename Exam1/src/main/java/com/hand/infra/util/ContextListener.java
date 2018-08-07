package com.hand.infra.util;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if(applicationEvent instanceof ContextStartedEvent){
            ContextStartedEvent contextStartedEvent = (ContextStartedEvent)applicationEvent;
            System.out.println("Context Start");
        }else if(applicationEvent instanceof ContextStoppedEvent){
            System.out.println("Context Stop");
        }
    }


}
