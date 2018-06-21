package dao;

import entity.UserCollect;
import java.util.List;

public interface UserCollectMapper {
    /**
     * insert one record into table from <tt>user_collect</tt>
     *
     * @param record
     */
    int insert(UserCollect record);

    /**
     *
     * @param record
     */
    int insertSelective(UserCollect record);

    /**
     * get one record by primary key from <tt>user_collect</tt>
     *
     * @param id
     */
    UserCollect selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(UserCollect record);

    /**
     * update one record by primary key from <tt>user_collect</tt>
     *
     * @param record
     */
    int updateByPrimaryKey(UserCollect record);

    /**
     * get all records from  <tt>user_collect</tt>
     *
     */
    List<UserCollect> selectAll();
}