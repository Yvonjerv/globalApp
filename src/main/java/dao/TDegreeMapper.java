package dao;

import model.TDegree;

import java.util.List;

public interface TDegreeMapper {
    int deleteByPrimaryKey(Integer degreeid);

    int insert(TDegree record);

    int insertSelective(TDegree record);

    TDegree selectByPrimaryKey(Integer degreeid);
    List<TDegree> selectBySelective(TDegree record);
    List<TDegree> select();
    int updateByPrimaryKeySelective(TDegree record);

    int updateByPrimaryKey(TDegree record);
}