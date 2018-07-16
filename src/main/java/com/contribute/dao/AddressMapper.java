package com.contribute.dao;

import com.contribute.entity.Address;
import java.util.List;

public interface AddressMapper {
    /**
     * insert one record into table from <tt>address</tt>
     *
     * @param record
     */
    int insert(Address record);

    /**
     *
     * @param record
     */
    int insertSelective(Address record);

    /**
     * get one record by primary key from <tt>address</tt>
     *
     * @param id
     */
    Address selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     * update one record by primary key from <tt>address</tt>
     *
     * @param record
     */
    int updateByPrimaryKey(Address record);

    /**
     * get all records from  <tt>address</tt>
     *
     */
    List<Address> selectAll();
}