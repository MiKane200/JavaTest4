package com.hand.infra.util;

import org.springframework.context.ApplicationEvent;

public class BeforeInsertFilmEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    public BeforeInsertFilmEvent(Object source) {
        super(source);
    }
}
