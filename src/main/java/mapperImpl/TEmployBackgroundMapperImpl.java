package mapperImpl;

import dao.TEmploybackgroundMapper;
import model.TEduBackground;
import model.TEmployBackground;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TEmployBackgroundMapperImpl implements TEmploybackgroundMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer eduBackgroundid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TEmployBackgroundMapper.deleteByPrimaryKey", eduBackgroundid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TEmployBackground record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TEmployBackgroundMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TEmployBackground record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TEmployBackgroundMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TEmployBackground selectByPrimaryKey(Integer eduBackgroundid) {
        session = sqlSessionFactory.openSession();
        TEmployBackground EmployBackground = session.selectOne("dao.TEmployBackgroundMapper.selectByPrimaryKey", eduBackgroundid);
        session.close();

        return EmployBackground;
    }

    @Override
    public List<TEmployBackground> selectBySelective(TEmployBackground record) {
        session = sqlSessionFactory.openSession();
        List<TEmployBackground> list = session.selectList("dao.TEmployBackgroundMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TEmployBackground record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TEmployBackgroundMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TEmployBackground record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TEmployBackgroundMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
