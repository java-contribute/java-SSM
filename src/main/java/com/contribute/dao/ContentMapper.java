package dao;

import entity.Content;
import java.util.List;

public interface ContentMapper {
    int insert(Content record);

    int insertSelective(Content record);

    Content selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKey(Content record);

    List<Content> selectAll();
}