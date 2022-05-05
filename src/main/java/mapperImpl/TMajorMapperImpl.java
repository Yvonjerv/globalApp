package mapperImpl;

import dao.TMajorMapper;
import model.TLocation;
import model.TMajor;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TMajorMapperImpl implements TMajorMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer majorid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TMajorMapper.deleteByPrimaryKey", majorid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TMajor record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TMajorMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TMajor record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TMajorMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TMajor selectByPrimaryKey(Integer majorid) {
        session = sqlSessionFactory.openSession();
        TMajor Major = session.selectOne("dao.TMajorMapper.selectByPrimaryKey", majorid);
        session.close();

        return Major;
    }

    @Override
    public List<TMajor> selectBySelective(TMajor record) {
        session = sqlSessionFactory.openSession();
        List<TMajor> list = session.selectList("dao.TMajorMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TMajor record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TMajorMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TMajor record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TMajorMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
