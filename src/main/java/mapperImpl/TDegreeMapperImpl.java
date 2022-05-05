package mapperImpl;

import dao.TDegreeMapper;
import model.TCountry;
import model.TCurrentlyInChina;
import model.TDegree;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tDegreeMapperImpl")
public class TDegreeMapperImpl implements TDegreeMapper {

    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;


    @Override
    public int deleteByPrimaryKey(Integer degreeid) {
        return 0;
    }

    @Override
    public int insert(TDegree record) {
        return 0;
    }

    @Override
    public int insertSelective(TDegree record) {
        return 0;
    }

    @Override
    public TDegree selectByPrimaryKey(Integer degreeid) {
        session = sqlSessionFactory.openSession();
        return session.selectOne("dao.TDegreeMapper.selectByPrimaryKey", degreeid);
    }

    @Override
    public List<TDegree> selectBySelective(TDegree record) {
        session = sqlSessionFactory.openSession();
        List<TDegree> list = session.selectList("dao.TDegreeMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public List<TDegree> select() {
        session = sqlSessionFactory.openSession();
        List<TDegree> list = session.selectList("dao.TDegreeMapper.select");
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TDegree record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TDegree record) {
        return 0;
    }
}
