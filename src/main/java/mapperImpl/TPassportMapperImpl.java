package mapperImpl;

import dao.TPassportMapper;
import model.TPassport;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TPassportMapperImpl implements TPassportMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer passportid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TPassportMapper.deleteByPrimaryKey", passportid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TPassport record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TPassportMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TPassport record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TPassportMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TPassport selectByPrimaryKey(Integer passportid) {
        session = sqlSessionFactory.openSession();
        TPassport Passport = session.selectOne("dao.TPassportMapper.selectByPrimaryKey", passportid);
        session.close();

        return Passport;
    }

    @Override
    public List<TPassport> selectBySelective(TPassport record) {
        session = sqlSessionFactory.openSession();
        List<TPassport> list = session.selectList("dao.TPassportMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TPassport record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TPassportMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TPassport record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TPassportMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
