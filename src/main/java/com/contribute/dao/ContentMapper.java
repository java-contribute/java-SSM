package com.contribute.dao;

import com.contribute.entity.Content;
import java.util.List;

public interface ContentMapper {
    /**
     * insert one record into table from <tt>content</tt>
     *
     * @param record
     */
    int insert(Content record);

    /**
     *
     * @param record
     */
    int insertSelective(Content record);

    /**
     * get one record by primary key from <tt>content</tt>
     *
     * @param id
     */
    Content selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Content record);

    /**
     * update one record by primary key from <tt>content</tt>
     *
     * @param record
     */
    int updateByPrimaryKey(Content record);

    /**
     * get all records from  <tt>content</tt>
     *
     */
    List<Content> selectAll();
}