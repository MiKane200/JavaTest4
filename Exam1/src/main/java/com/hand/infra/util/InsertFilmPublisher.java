package com.hand.infra.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class InsertFilmPublisher {
    @Autowired
    private ApplicationContext applicationContext;

    public void publishBefore(){
        applicationContext.publishEvent(new BeforeInsertFilmEvent(this));
    }
    public void publishAfter(){
        applicationContext.publishEvent(new AfterInsertFilmEvent(this));
    }
}
