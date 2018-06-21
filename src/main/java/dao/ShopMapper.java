package dao;

import entity.Shop;
import java.util.List;

public interface ShopMapper {
    /**
     * insert one record into table from <tt>shop</tt>
     *
     * @param record
     */
    int insert(Shop record);

    /**
     *
     * @param record
     */
    int insertSelective(Shop record);

    /**
     * get one record by primary key from <tt>shop</tt>
     *
     * @param id
     */
    Shop selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     * update one record by primary key from <tt>shop</tt>
     *
     * @param record
     */
    int updateByPrimaryKey(Shop record);

    /**
     * get all records from  <tt>shop</tt>
     *
     */
    List<Shop> selectAll();
}