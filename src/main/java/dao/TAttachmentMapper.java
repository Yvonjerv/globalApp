package dao;


import model.TAttachment;

import java.util.List;

public interface TAttachmentMapper {
    int deleteByPrimaryKey(Integer attachmentid);

    int insert(TAttachment record);

    int insertSelective(TAttachment record);

    TAttachment selectByPrimaryKey(Integer attachmentid);
    List<TAttachment> selectBySelective(TAttachment record);
    int updateByPrimaryKeySelective(TAttachment record);

    int updateByPrimaryKey(TAttachment record);
}