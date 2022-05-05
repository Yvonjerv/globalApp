package dao;

import model.TEduBackground;

import java.util.List;

public interface TEduBackgroundMapper {
    int deleteByPrimaryKey(Integer educationid);

    int insert(TEduBackground record);

    int insertSelective(TEduBackground record);

    TEduBackground selectByPrimaryKey(Integer educationid);
    List<TEduBackground> selectBySelective(TEduBackground record);
    int updateByPrimaryKeySelective(TEduBackground record);

    int updateByPrimaryKey(TEduBackground record);
}