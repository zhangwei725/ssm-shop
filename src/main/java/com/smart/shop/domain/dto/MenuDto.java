package com.smart.shop.domain.dto;

import com.smart.shop.domain.entity.Menu;
import com.smart.shop.domain.entity.Sub;
import lombok.Data;

import java.util.List;

@Data
public class MenuDto extends Menu {
    private List<SubDto> list;
}
