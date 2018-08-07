package com.hand.infra.util;

import org.springframework.context.ApplicationEvent;

public class AfterInsertFilmEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;

    public AfterInsertFilmEvent(Object source) {
        super(source);
    }
}
