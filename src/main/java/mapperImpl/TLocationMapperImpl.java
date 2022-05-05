package mapperImpl;

import dao.TLocationMapper;
import model.TLocation;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TLocationMapperImpl implements TLocationMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public int deleteByPrimaryKey(Integer locationid) {
        return 0;
    }

    @Override
    public int insert(TLocation record) {
        return 0;
    }

    @Override
    public int insertSelective(TLocation record) {
        return 0;
    }

    @Override
    public TLocation selectByPrimaryKey(Integer locationid) {
        session = sqlSessionFactory.openSession();
        return session.selectOne("dao.TLocationMapper.selectByPrimaryKey", locationid);
    }

    @Override
    public List<TLocation> selectBySelective(TLocation record) {
        session = sqlSessionFactory.openSession();
        List<TLocation> list = session.selectList("dao.TLocationMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public List<TLocation> select() {
        session = sqlSessionFactory.openSession();
        List<TLocation> list = session.selectList("dao.TLocationMapper.select");
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TLocation record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TLocation record) {
        return 0;
    }
}
