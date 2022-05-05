package impl;

import mapperImpl.TAttachmentMapperImpl;
import model.TAttachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AttachmentService;

import java.util.List;

@Service
public class AttachmentServiceImpl implements AttachmentService {
    @Autowired
    private TAttachmentMapperImpl tAttachmentMapper;
    
    @Override
    public int deleteAttachment(int attachmentid) {
        return tAttachmentMapper.deleteByPrimaryKey(attachmentid);
    }

    @Override
    public int insertAttachment(TAttachment record) {
        return tAttachmentMapper.insertSelective(record);
    }

    @Override
    public List<TAttachment> getAttachmentsSelective(TAttachment record) {
        return tAttachmentMapper.selectBySelective(record);
    }

    @Override
    public TAttachment selectAttachmentById(int attachmentid) {
        return tAttachmentMapper.selectByPrimaryKey(attachmentid);
    }

    @Override
    public int updateAttachment(TAttachment record) {
        return tAttachmentMapper.updateByPrimaryKeySelective(record);
    }
}
