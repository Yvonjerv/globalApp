package dao;

import model.TChineseProf;

import java.util.List;

public interface TChineseProfMapper {
    int deleteByPrimaryKey(Integer chineseprofid);

    int insert(TChineseProf record);

    int insertSelective(TChineseProf record);

    TChineseProf selectByPrimaryKey(Integer chineseprofid);
    List<TChineseProf> selectBySelective(TChineseProf record);

    int updateByPrimaryKeySelective(TChineseProf record);

    int updateByPrimaryKey(TChineseProf record);
}