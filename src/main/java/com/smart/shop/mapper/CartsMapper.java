package com.smart.shop.mapper;

import com.smart.shop.domain.entity.Carts;
import com.smart.shop.exception.DaoException;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * crud工程师
 * 动手 举一反三
 */
public interface CartsMapper {

    List<Carts> selectAll(@Param("mid") int mid) throws DaoException;

    Carts selectByMidAndPid(@Param("mid") int mid, @Param("pid") int pid) throws DaoException;

    /**
     * 更新购物车的数量
     *
     * @param cartsId 购物车iD
     * @param num     数量
     * @return
     */
    int update(@Param("cartsId") int cartsId, @Param("num") int num) throws DaoException;

    int insert(@Param("carts") Carts carts) throws DaoException;

    int updateBatch(@Param("ids") List<Integer> ids) throws DaoException;

}