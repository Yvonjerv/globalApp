package dao;

import model.TEnglishProf;

import java.util.List;

public interface TEnglishProfMapper {
    int deleteByPrimaryKey(Integer englishprofid);

    int insert(TEnglishProf record);

    int insertSelective(TEnglishProf record);

    TEnglishProf selectByPrimaryKey(Integer englishprofid);
    List<TEnglishProf> selectBySelective(TEnglishProf record);
    int updateByPrimaryKeySelective(TEnglishProf record);

    int updateByPrimaryKey(TEnglishProf record);
}