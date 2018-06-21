package dao;

import entity.ShoppingCartMerchandise;
import java.util.List;

public interface ShoppingCartMerchandiseMapper {
    /**
     * insert one record into table from <tt>shopping_cart_merchandise</tt>
     *
     * @param record
     */
    int insert(ShoppingCartMerchandise record);

    /**
     *
     * @param record
     */
    int insertSelective(ShoppingCartMerchandise record);

    /**
     * get one record by primary key from <tt>shopping_cart_merchandise</tt>
     *
     * @param id
     */
    ShoppingCartMerchandise selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(ShoppingCartMerchandise record);

    /**
     * update one record by primary key from <tt>shopping_cart_merchandise</tt>
     *
     * @param record
     */
    int updateByPrimaryKey(ShoppingCartMerchandise record);

    /**
     * get all records from  <tt>shopping_cart_merchandise</tt>
     *
     */
    List<ShoppingCartMerchandise> selectAll();
}