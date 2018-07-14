package dao;

import entity.ShoppingCartMerchandise;
import java.util.List;

public interface ShoppingCartMerchandiseMapper {
    int insert(ShoppingCartMerchandise record);

    int insertSelective(ShoppingCartMerchandise record);

    ShoppingCartMerchandise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShoppingCartMerchandise record);

    int updateByPrimaryKey(ShoppingCartMerchandise record);

    List<ShoppingCartMerchandise> selectAll();
}