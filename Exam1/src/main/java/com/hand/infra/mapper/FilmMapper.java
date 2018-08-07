package com.hand.infra.mapper;

import com.hand.domain.entity.Film;

public interface FilmMapper {
    int insert(Film record);

    int insertSelective(Film record);
}