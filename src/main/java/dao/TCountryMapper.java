package dao;

import model.TCountry;

import java.util.List;

public interface TCountryMapper {
    int deleteByPrimaryKey(String alpha);

    int insert(TCountry record);

    int insertSelective(TCountry record);

    TCountry selectByPrimaryKey(String alpha);

    List<TCountry> select();


    int updateByPrimaryKeySelective(TCountry record);

    int updateByPrimaryKey(TCountry record);
}