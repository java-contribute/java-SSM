package dao;

import entity.Merchandise;
import java.util.List;

public interface MerchandiseMapper {
    int insert(Merchandise record);

    int insertSelective(Merchandise record);

    Merchandise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Merchandise record);

    int updateByPrimaryKey(Merchandise record);

    List<Merchandise> selectAll();
}