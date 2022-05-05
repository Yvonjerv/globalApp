package mapperImpl;

import dao.TChineseProfMapper;
import model.TChineseProf;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TChineseProfMapperImpl implements TChineseProfMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer chineseProfid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TChineseProfMapper.deleteByPrimaryKey", chineseProfid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TChineseProf record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TChineseProfMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TChineseProf record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TChineseProfMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TChineseProf selectByPrimaryKey(Integer chineseProfid) {
        session = sqlSessionFactory.openSession();
        TChineseProf ChineseProf = session.selectOne("dao.TChineseProfMapper.selectByPrimaryKey", chineseProfid);
        session.close();

        return ChineseProf;
    }

    @Override
    public List<TChineseProf> selectBySelective(TChineseProf record) {
        session = sqlSessionFactory.openSession();
        List<TChineseProf> list = session.selectList("dao.TChineseProfMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TChineseProf record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TChineseProfMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TChineseProf record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TChineseProfMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
