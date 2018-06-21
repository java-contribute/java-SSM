package dao;

import entity.ShopNotice;
import java.util.List;

public interface ShopNoticeMapper {
    /**
     * insert one record into table from <tt>shop_notice</tt>
     *
     * @param record
     */
    int insert(ShopNotice record);

    /**
     *
     * @param record
     */
    int insertSelective(ShopNotice record);

    /**
     * get one record by primary key from <tt>shop_notice</tt>
     *
     * @param id
     */
    ShopNotice selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(ShopNotice record);

    /**
     * update one record by primary key from <tt>shop_notice</tt>
     *
     * @param record
     */
    int updateByPrimaryKey(ShopNotice record);

    /**
     * get all records from  <tt>shop_notice</tt>
     *
     */
    List<ShopNotice> selectAll();
}