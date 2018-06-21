package dao;

import entity.User;
import java.util.List;

public interface UserMapper {
    /**
     * insert one record into table from <tt>user</tt>
     *
     * @param record
     */
    int insert(User record);

    /**
     *
     * @param record
     */
    int insertSelective(User record);

    /**
     * get one record by primary key from <tt>user</tt>
     *
     * @param id
     */
    User selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * update one record by primary key from <tt>user</tt>
     *
     * @param record
     */
    int updateByPrimaryKey(User record);

    /**
     * get all records from  <tt>user</tt>
     *
     */
    List<User> selectAll();
}