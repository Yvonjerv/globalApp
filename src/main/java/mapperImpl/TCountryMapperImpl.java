package mapperImpl;

import dao.TCountryMapper;
import model.TCountry;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tCountryMapperImpl")
public class TCountryMapperImpl implements TCountryMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public int deleteByPrimaryKey(String alpha3) {
        session = sqlSessionFactory.openSession();
        return 0;
    }

    @Override
    public int insert(TCountry record) {
        session = sqlSessionFactory.openSession();
        return 0;
    }

    @Override
    public int insertSelective(TCountry record) {
        session = sqlSessionFactory.openSession();
        return 0;
    }

    @Override
    public TCountry selectByPrimaryKey(String alpha3) {
        session = sqlSessionFactory.openSession();
        TCountry country = session.selectOne("dao.TCountryMapper.selectByPrimaryKey", alpha3);
        return country;
    }

    @Override
    public List<TCountry> select() {
        session = sqlSessionFactory.openSession();
        List<TCountry> list = session.selectList("dao.TCountryMapper.select");
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TCountry record) {
        session = sqlSessionFactory.openSession();
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TCountry record) {
        session = sqlSessionFactory.openSession();
        return 0;
    }
}
