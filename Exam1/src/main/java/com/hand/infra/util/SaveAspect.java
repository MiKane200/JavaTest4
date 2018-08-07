package com.hand.infra.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class SaveAspect {

    @Autowired
    private InsertFilmPublisher insertFilmPublisher;

    public void before(){
        insertFilmPublisher.publishBefore();
    }

    public void after(){
        insertFilmPublisher.publishAfter();
    }
}
