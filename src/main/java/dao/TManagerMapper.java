package dao;

import model.TManager;

import java.util.List;

public interface TManagerMapper {
    int deleteByPrimaryKey(Integer managerid);

    int insert(TManager record);

    int insertSelective(TManager record);

    TManager selectByPrimaryKey(Integer managerid);
    List<TManager> selectBySelective(TManager record);
    int updateByPrimaryKeySelective(TManager record);

    int updateByPrimaryKey(TManager record);
}