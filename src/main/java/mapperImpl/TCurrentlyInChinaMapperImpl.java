package mapperImpl;

import dao.TCurrentlyInChinaMapper;
import model.TCurrentlyInChina;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCurrentlyInChinaMapperImpl implements TCurrentlyInChinaMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer currentlyInChinaid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TCurrentlyInChinaMapper.deleteByPrimaryKey", currentlyInChinaid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TCurrentlyInChina record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TCurrentlyInChinaMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TCurrentlyInChina record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TCurrentlyInChinaMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TCurrentlyInChina selectByPrimaryKey(Integer currentlyInChinaid) {
        session = sqlSessionFactory.openSession();
        TCurrentlyInChina CurrentlyInChina = session.selectOne("dao.TCurrentlyInChinaMapper.selectByPrimaryKey", currentlyInChinaid);
        session.close();

        return CurrentlyInChina;
    }

    @Override
    public List<TCurrentlyInChina> selectBySelective(TCurrentlyInChina record) {
        session = sqlSessionFactory.openSession();
        List<TCurrentlyInChina> list = session.selectList("dao.TCurrentlyInChinaMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TCurrentlyInChina record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TCurrentlyInChinaMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TCurrentlyInChina record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TCurrentlyInChinaMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
