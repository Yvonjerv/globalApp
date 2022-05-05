package mapperImpl;

import dao.TEnglishProfMapper;
import model.TEnglishProf;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TEnglishProfMapperImpl implements TEnglishProfMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer englishProfid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TEnglishProfMapper.deleteByPrimaryKey", englishProfid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TEnglishProf record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TEnglishProfMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TEnglishProf record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TEnglishProfMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TEnglishProf selectByPrimaryKey(Integer englishProfid) {
        session = sqlSessionFactory.openSession();
        TEnglishProf EnglishProf = session.selectOne("dao.TEnglishProfMapper.selectByPrimaryKey", englishProfid);
        session.close();

        return EnglishProf;
    }

    @Override
    public List<TEnglishProf> selectBySelective(TEnglishProf record) {
        session = sqlSessionFactory.openSession();
        List<TEnglishProf> list = session.selectList("dao.TEnglishProfMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TEnglishProf record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TEnglishProfMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TEnglishProf record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TEnglishProfMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
