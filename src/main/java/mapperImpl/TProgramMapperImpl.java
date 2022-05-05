package mapperImpl;

import dao.TProgramMapper;
import model.TProgram;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TProgramMapperImpl implements TProgramMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer programid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TProgramMapper.deleteByPrimaryKey", programid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TProgram record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TProgramMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TProgram record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TProgramMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TProgram selectByPrimaryKey(Integer programid) {
        session = sqlSessionFactory.openSession();
        TProgram Program = session.selectOne("dao.TProgramMapper.selectByPrimaryKey", programid);
        session.close();

        return Program;
    }

    @Override
    public List<TProgram> selectBySelective(TProgram record) {
        session = sqlSessionFactory.openSession();
        List<TProgram> list = session.selectList("dao.TProgramMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TProgram record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TProgramMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TProgram record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TProgramMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
