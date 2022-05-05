package dao;

import model.TProgram;

import java.util.List;

public interface TProgramMapper {
    int deleteByPrimaryKey(Integer programid);

    int insert(TProgram record);

    int insertSelective(TProgram record);

    TProgram selectByPrimaryKey(Integer programid);
    List<TProgram> selectBySelective(TProgram record);
    int updateByPrimaryKeySelective(TProgram record);

    int updateByPrimaryKey(TProgram record);
}