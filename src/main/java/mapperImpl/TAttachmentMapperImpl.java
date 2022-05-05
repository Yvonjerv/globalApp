package mapperImpl;

import dao.TAttachmentMapper;
import model.TAttachment;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TAttachmentMapperImpl implements TAttachmentMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public int deleteByPrimaryKey(Integer attachmentid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TAttachmentMapper.deleteByPrimaryKey", attachmentid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TAttachment record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TAttachmentMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TAttachment record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TAttachmentMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TAttachment selectByPrimaryKey(Integer attachmentid) {
        session = sqlSessionFactory.openSession();
        TAttachment Attachment = session.selectOne("dao.TAttachmentMapper.selectByPrimaryKey", attachmentid);
        session.close();

        return Attachment;
    }

    @Override
    public List<TAttachment> selectBySelective(TAttachment record) {
        session = sqlSessionFactory.openSession();
        List<TAttachment> list = session.selectList("dao.TAttachmentMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TAttachment record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TAttachmentMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TAttachment record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TAttachmentMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}