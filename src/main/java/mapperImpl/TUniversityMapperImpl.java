package mapperImpl;

import dao.TUniversityMapper;
import model.TUniversity;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TUniversityMapperImpl implements TUniversityMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer universityid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TUniversityMapper.deleteByPrimaryKey", universityid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TUniversity record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TUniversityMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TUniversity record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TUniversityMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TUniversity selectByPrimaryKey(Integer universityid) {
        session = sqlSessionFactory.openSession();
        TUniversity University = session.selectOne("dao.TUniversityMapper.selectByPrimaryKey", universityid);
        session.close();

        return University;
    }

    @Override
    public List<TUniversity> selectBySelective(TUniversity record) {
        session = sqlSessionFactory.openSession();
        List<TUniversity> list = session.selectList("dao.TUniversityMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TUniversity record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TUniversityMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TUniversity record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TUniversityMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
