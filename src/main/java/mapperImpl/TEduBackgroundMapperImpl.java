package mapperImpl;

import dao.TEduBackgroundMapper;
import model.TEduBackground;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TEduBackgroundMapperImpl implements TEduBackgroundMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer eduBackgroundid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TEduBackgroundMapper.deleteByPrimaryKey", eduBackgroundid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TEduBackground record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TEduBackgroundMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TEduBackground record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TEduBackgroundMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TEduBackground selectByPrimaryKey(Integer eduBackgroundid) {
        session = sqlSessionFactory.openSession();
        TEduBackground EduBackground = session.selectOne("dao.TEduBackgroundMapper.selectByPrimaryKey", eduBackgroundid);
        session.close();

        return EduBackground;
    }

    @Override
    public List<TEduBackground> selectBySelective(TEduBackground record) {
        session = sqlSessionFactory.openSession();
        List<TEduBackground> list = session.selectList("dao.TEduBackgroundMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TEduBackground record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TEduBackgroundMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TEduBackground record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TEduBackgroundMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
