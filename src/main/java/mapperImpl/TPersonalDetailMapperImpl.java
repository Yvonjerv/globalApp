package mapperImpl;

import dao.TPersonalDetailMapper;
import model.TPersonalDetail;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TPersonalDetailMapperImpl implements TPersonalDetailMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer personid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TPersonalDetailMapper.deleteByPrimaryKey", personid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TPersonalDetail record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TPersonalDetailMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TPersonalDetail record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TPersonalDetailMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TPersonalDetail selectByPrimaryKey(Integer personid) {
        session = sqlSessionFactory.openSession();
        TPersonalDetail pers = session.selectOne("dao.TPersonalDetailMapper.selectByPrimaryKey", personid);
        session.close();

        return pers;
    }

    @Override
    public List<TPersonalDetail> selectBySelective(TPersonalDetail record) {
        session = sqlSessionFactory.openSession();
        List<TPersonalDetail> list = session.selectList("dao.TPersonalDetailMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TPersonalDetail record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TPersonalDetailMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TPersonalDetail record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TPersonalDetailMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
