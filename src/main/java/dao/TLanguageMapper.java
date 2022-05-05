package dao;

import model.TLanguage;

import java.util.List;

public interface TLanguageMapper {
    int deleteByPrimaryKey(Integer langid);

    int insert(TLanguage record);

    int insertSelective(TLanguage record);

    TLanguage selectByPrimaryKey(Integer langid);
    List<TLanguage> selectBySelective(TLanguage record);
    int updateByPrimaryKeySelective(TLanguage record);

    int updateByPrimaryKey(TLanguage record);
}