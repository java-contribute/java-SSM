package dao;

import entity.Merchandise;
import java.util.List;

public interface MerchandiseMapper {
    /**
     * insert one record into table from <tt>merchandise</tt>
     *
     * @param record
     */
    int insert(Merchandise record);

    /**
     *
     * @param record
     */
    int insertSelective(Merchandise record);

    /**
     * get one record by primary key from <tt>merchandise</tt>
     *
     * @param id
     */
    Merchandise selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Merchandise record);

    /**
     * update one record by primary key from <tt>merchandise</tt>
     *
     * @param record
     */
    int updateByPrimaryKey(Merchandise record);

    /**
     * get all records from  <tt>merchandise</tt>
     *
     */
    List<Merchandise> selectAll();
}