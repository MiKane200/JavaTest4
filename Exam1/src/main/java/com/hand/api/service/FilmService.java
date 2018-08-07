package com.hand.api.service;

import com.hand.domain.entity.Film;

public interface FilmService{
    public void saveSuccess(Film film) throws Exception;
    public void saveFail(Film film) throws Exception;
}
