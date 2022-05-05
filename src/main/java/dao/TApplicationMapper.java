package dao;

import model.TApplication;

import java.util.List;

public interface TApplicationMapper {
    int deleteByPrimaryKey(String applicationno);

    int insert(TApplication record);

    int insertSelective(TApplication record);

    TApplication selectByPrimaryKey(String applicationno);

    List<TApplication> selectBySelective(TApplication record);

    int updateByPrimaryKeySelective(TApplication record);

    int updateByPrimaryKeyWithBLOBs(TApplication record);

    int updateByPrimaryKey(TApplication record);
}