package dao;

import model.TUniversity;
import model.TUser;

import java.util.List;

public interface TUniversityMapper {
    int deleteByPrimaryKey(Integer universityid);

    int insert(TUniversity record);

    int insertSelective(TUniversity record);

    TUniversity selectByPrimaryKey(Integer universityid);

    List<TUniversity> selectBySelective(TUniversity record);

    int updateByPrimaryKeySelective(TUniversity record);

    int updateByPrimaryKey(TUniversity record);
}