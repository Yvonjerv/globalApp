package dao;

import model.TMajor;

import java.util.List;

public interface TMajorMapper {
    int deleteByPrimaryKey(Integer majorid);

    int insert(TMajor record);

    int insertSelective(TMajor record);

    TMajor selectByPrimaryKey(Integer majorid);
    List<TMajor> selectBySelective(TMajor record);
    int updateByPrimaryKeySelective(TMajor record);

    int updateByPrimaryKey(TMajor record);
}