package dao;

import model.TLocation;

import java.util.List;

public interface TLocationMapper {
    int deleteByPrimaryKey(Integer locationid);

    int insert(TLocation record);

    int insertSelective(TLocation record);

    TLocation selectByPrimaryKey(Integer locationid);
    List<TLocation> selectBySelective(TLocation record);
    List<TLocation> select();

    int updateByPrimaryKeySelective(TLocation record);

    int updateByPrimaryKey(TLocation record);
}