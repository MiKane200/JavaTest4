package com.hand.infra.util;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class InsertFilmListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if(applicationEvent instanceof BeforeInsertFilmEvent){
            System.out.println("Before Insert Film Data");
        }else if(applicationEvent instanceof AfterInsertFilmEvent){
            System.out.println("After Insert Film Data");
        }
    }
}
