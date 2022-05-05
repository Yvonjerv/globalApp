package dao;

import model.TCurrentlyInChina;

import java.util.List;

public interface TCurrentlyInChinaMapper {
    int deleteByPrimaryKey(Integer currentchinaid);

    int insert(TCurrentlyInChina record);

    int insertSelective(TCurrentlyInChina record);

    TCurrentlyInChina selectByPrimaryKey(Integer currentchinaid);

    List<TCurrentlyInChina> selectBySelective(TCurrentlyInChina record);

    int updateByPrimaryKeySelective(TCurrentlyInChina record);

    int updateByPrimaryKey(TCurrentlyInChina record);
}