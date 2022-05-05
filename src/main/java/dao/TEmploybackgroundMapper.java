package dao;

import model.TEmployBackground;

import java.util.List;

public interface TEmploybackgroundMapper {
    int deleteByPrimaryKey(Integer employmentid);

    int insert(TEmployBackground record);

    int insertSelective(TEmployBackground record);

    TEmployBackground selectByPrimaryKey(Integer employmentid);
    List<TEmployBackground> selectBySelective(TEmployBackground record);
    int updateByPrimaryKeySelective(TEmployBackground record);

    int updateByPrimaryKey(TEmployBackground record);
}