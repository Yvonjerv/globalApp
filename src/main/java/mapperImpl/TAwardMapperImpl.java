package mapperImpl;

import dao.TAwardMapper;
import model.TAward;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TAwardMapperImpl implements TAwardMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer awardid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TAwardMapper.deleteByPrimaryKey", awardid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TAward record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TAwardMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TAward record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TAwardMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TAward selectByPrimaryKey(Integer awardid) {
        session = sqlSessionFactory.openSession();
        TAward Award = session.selectOne("dao.TAwardMapper.selectByPrimaryKey", awardid);
        session.close();

        return Award;
    }

    @Override
    public List<TAward> selectBySelective(TAward record) {
        session = sqlSessionFactory.openSession();
        List<TAward> list = session.selectList("dao.TAwardMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TAward record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TAwardMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TAward record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TAwardMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
