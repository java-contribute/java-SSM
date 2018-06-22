package com.contribute.dao;

import com.contribute.entity.Image;
import java.util.List;

public interface ImageMapper {
    /**
     * insert one record into table from <tt>image</tt>
     *
     * @param record
     */
    int insert(Image record);

    /**
     *
     * @param record
     */
    int insertSelective(Image record);

    /**
     * get one record by primary key from <tt>image</tt>
     *
     * @param id
     */
    Image selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Image record);

    /**
     * update one record by primary key from <tt>image</tt>
     *
     * @param record
     */
    int updateByPrimaryKey(Image record);

    /**
     * get all records from  <tt>image</tt>
     *
     */
    List<Image> selectAll();
}