package service;

import model.TAttachment;

import java.util.List;

public interface AttachmentService {
    public int deleteAttachment(int attachmentid);

    public int insertAttachment(TAttachment record);

    public List<TAttachment> getAttachmentsSelective(TAttachment record);
    
    public TAttachment selectAttachmentById(int attachmentid);

    public int updateAttachment(TAttachment record);
}
