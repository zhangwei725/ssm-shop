package com.smart.shop.service.impl;

import com.smart.shop.domain.dto.MenuDto;
import com.smart.shop.mapper.MenuSubMapper;
import com.smart.shop.service.HomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {
    @Resource
    MenuSubMapper menuSubMapper;

    @Override
    public List<MenuDto> findMenus() {
        List<MenuDto> menuDtos = menuSubMapper.selectAll();
        return menuDtos;
    }
}
