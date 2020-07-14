package com.smart.shop.service;

import com.smart.shop.domain.dto.MenuDto;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface HomeService {
    List<MenuDto> findMenus();
}
