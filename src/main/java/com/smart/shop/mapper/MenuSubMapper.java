package com.smart.shop.mapper;

import com.smart.shop.domain.dto.MenuDto;

import java.util.List;

public interface MenuSubMapper {
    List<MenuDto> selectAll();
}
