package dao;

import entity.UserCollect;
import java.util.List;

public interface UserCollectMapper {
    int insert(UserCollect record);

    int insertSelective(UserCollect record);

    UserCollect selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserCollect record);

    int updateByPrimaryKey(UserCollect record);

    List<UserCollect> selectAll();
}