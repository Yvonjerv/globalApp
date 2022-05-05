package mapperImpl;

import dao.TApplicationMapper;
import model.TAddress;
import model.TApplication;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TApplicationMapperImpl implements TApplicationMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public int deleteByPrimaryKey(String applicationno) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TApplicationMapper.deleteByPrimaryKey", applicationno);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TApplication record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TApplicationMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TApplication record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TApplicationMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TApplication selectByPrimaryKey(String applicationno) {
        session = sqlSessionFactory.openSession();
        TApplication application = session.selectOne("dao.TApplicationMapper.selectByPrimaryKey", applicationno);
        session.close();

        return application;
    }

    @Override
    public List<TApplication> selectBySelective(TApplication record) {
        session = sqlSessionFactory.openSession();
        List<TApplication> list = session.selectList("dao.TApplicationMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TApplication record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TApplicationMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(TApplication record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TApplication record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TApplicationMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
