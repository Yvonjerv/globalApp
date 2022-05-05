package dao;

import model.TAddress;

import java.util.List;

public interface TAddressMapper {
    int deleteByPrimaryKey(Integer addressid);

    int insert(TAddress record);

    int insertSelective(TAddress record);

    TAddress selectByPrimaryKey(Integer addressid);

    List<TAddress> selectBySelective(TAddress record);

    int updateByPrimaryKeySelective(TAddress record);



    int updateByPrimaryKey(TAddress record);
}