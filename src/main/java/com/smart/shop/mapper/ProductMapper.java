package com.smart.shop.mapper;

import com.smart.shop.domain.entity.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    Product selectById(@Param("pid") int pid);

    int updateStockById(@Param("pid") int pid, @Param("stock") int stock, @Param("version") int version);
}