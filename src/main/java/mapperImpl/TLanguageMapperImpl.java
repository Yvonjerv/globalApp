package mapperImpl;

import dao.TLanguageMapper;
import model.TLanguage;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TLanguageMapperImpl implements TLanguageMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer languageid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TLanguageMapper.deleteByPrimaryKey", languageid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TLanguage record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TLanguageMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TLanguage record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TLanguageMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TLanguage selectByPrimaryKey(Integer languageid) {
        session = sqlSessionFactory.openSession();
        TLanguage Language = session.selectOne("dao.TLanguageMapper.selectByPrimaryKey", languageid);
        session.close();

        return Language;
    }

    @Override
    public List<TLanguage> selectBySelective(TLanguage record) {
        session = sqlSessionFactory.openSession();
        List<TLanguage> list = session.selectList("dao.TLanguageMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TLanguage record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TLanguageMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TLanguage record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TLanguageMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
