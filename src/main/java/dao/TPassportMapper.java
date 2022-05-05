package dao;

import model.TPassport;

import java.util.List;

public interface TPassportMapper {
    int deleteByPrimaryKey(Integer passid);

    int insert(TPassport record);

    int insertSelective(TPassport record);

    TPassport selectByPrimaryKey(Integer passid);
    List<TPassport> selectBySelective(TPassport record);
    int updateByPrimaryKeySelective(TPassport record);

    int updateByPrimaryKey(TPassport record);
}