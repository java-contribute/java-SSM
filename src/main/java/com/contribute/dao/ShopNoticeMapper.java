package dao;

import entity.ShopNotice;
import java.util.List;

public interface ShopNoticeMapper {
    int insert(ShopNotice record);

    int insertSelective(ShopNotice record);

    ShopNotice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShopNotice record);

    int updateByPrimaryKey(ShopNotice record);

    List<ShopNotice> selectAll();
}