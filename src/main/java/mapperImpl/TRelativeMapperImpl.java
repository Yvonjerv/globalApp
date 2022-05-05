package mapperImpl;

import dao.TRelativeMapper;
import model.TRelative;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TRelativeMapperImpl implements TRelativeMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer relativeid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TRelativeMapper.deleteByPrimaryKey", relativeid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TRelative record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TRelativeMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TRelative record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TRelativeMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TRelative selectByPrimaryKey(Integer relativeid) {
        session = sqlSessionFactory.openSession();
        TRelative Relative = session.selectOne("dao.TRelativeMapper.selectByPrimaryKey", relativeid);
        session.close();

        return Relative;
    }

    @Override
    public List<TRelative> selectBySelective(TRelative record) {
        session = sqlSessionFactory.openSession();
        List<TRelative> list = session.selectList("dao.TRelativeMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TRelative record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TRelativeMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TRelative record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TRelativeMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
