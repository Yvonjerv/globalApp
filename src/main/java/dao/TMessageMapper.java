package dao;

import model.TManager;
import model.TMessage;

import java.util.List;

public interface TMessageMapper {
    int deleteByPrimaryKey(Integer messageid);

    int insert(TMessage record);

    int insertSelective(TMessage record);

    List<TMessage> selectBySelective(TMessage record);

    TMessage selectByPrimaryKey(Integer messageid);

    int updateByPrimaryKeySelective(TMessage record);

    int updateByPrimaryKeyWithBLOBs(TMessage record);

    int updateByPrimaryKey(TMessage record);
}