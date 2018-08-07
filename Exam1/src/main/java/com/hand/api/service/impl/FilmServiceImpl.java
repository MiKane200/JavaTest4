package com.hand.api.service.impl;

import com.hand.api.service.FilmService;
import com.hand.domain.entity.Film;
import com.hand.infra.mapper.FilmMapper;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class)
public class FilmServiceImpl implements FilmService {

    private FilmMapper filmMapper;

    public void setFilmMapper(FilmMapper filmMapper) {
        this.filmMapper = filmMapper;
    }

    @Override
    public void saveSuccess(Film film) throws Exception {
        filmMapper.insert(film);
    }

    @Override
    public void saveFail(Film film) throws Exception {
        filmMapper.insert(film);
        throw new Exception("Transactional rollback test!");
    }
}
