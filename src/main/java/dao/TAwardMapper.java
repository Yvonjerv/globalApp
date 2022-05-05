package dao;

import model.TAward;

import java.util.List;

public interface TAwardMapper {
    int deleteByPrimaryKey(Integer awardid);

    int insert(TAward record);

    int insertSelective(TAward record);

    TAward selectByPrimaryKey(Integer awardid);
    List<TAward> selectBySelective(TAward record);

    int updateByPrimaryKeySelective(TAward record);

    int updateByPrimaryKey(TAward record);
}