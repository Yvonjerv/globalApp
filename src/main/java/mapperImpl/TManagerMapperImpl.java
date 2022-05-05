package mapperImpl;

import dao.TManagerMapper;
import model.TManager;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TManagerMapperImpl implements TManagerMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer managerid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TManagerMapper.deleteByPrimaryKey", managerid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TManager record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TManagerMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TManager record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TManagerMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TManager selectByPrimaryKey(Integer managerid) {
        session = sqlSessionFactory.openSession();
        TManager Manager = session.selectOne("dao.TManagerMapper.selectByPrimaryKey", managerid);
        session.close();

        return Manager;
    }

    @Override
    public List<TManager> selectBySelective(TManager record) {
        session = sqlSessionFactory.openSession();
        List<TManager> list = session.selectList("dao.TManagerMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TManager record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TManagerMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TManager record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TManagerMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
