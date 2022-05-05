package dao;

import model.TPersonalDetail;

import java.util.List;

public interface TPersonalDetailMapper {
    int deleteByPrimaryKey(Integer personid);

    int insert(TPersonalDetail record);

    int insertSelective(TPersonalDetail record);

    TPersonalDetail selectByPrimaryKey(Integer personid);
    List<TPersonalDetail> selectBySelective(TPersonalDetail record);
    int updateByPrimaryKeySelective(TPersonalDetail record);

    int updateByPrimaryKey(TPersonalDetail record);
}