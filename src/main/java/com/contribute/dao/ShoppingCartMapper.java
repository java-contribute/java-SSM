package com.contribute.dao;

import com.contribute.entity.ShoppingCart;
import java.util.List;

public interface ShoppingCartMapper {
    /**
     * insert one record into table from <tt>shopping_cart</tt>
     *
     * @param record
     */
    int insert(ShoppingCart record);

    /**
     *
     * @param record
     */
    int insertSelective(ShoppingCart record);

    /**
     * get one record by primary key from <tt>shopping_cart</tt>
     *
     * @param id
     */
    ShoppingCart selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(ShoppingCart record);

    /**
     * update one record by primary key from <tt>shopping_cart</tt>
     *
     * @param record
     */
    int updateByPrimaryKey(ShoppingCart record);

    /**
     * get all records from  <tt>shopping_cart</tt>
     *
     */
    List<ShoppingCart> selectAll();
}