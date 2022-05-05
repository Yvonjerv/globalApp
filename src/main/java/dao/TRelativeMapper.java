package dao;

import model.TRelative;

import java.util.List;

public interface TRelativeMapper {
    int deleteByPrimaryKey(Integer relativeid);

    int insert(TRelative record);

    int insertSelective(TRelative record);

    TRelative selectByPrimaryKey(Integer relativeid);
    List<TRelative> selectBySelective(TRelative record);
    int updateByPrimaryKeySelective(TRelative record);

    int updateByPrimaryKey(TRelative record);
}