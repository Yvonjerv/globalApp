package mapperImpl;

import dao.TStudyPlanMapper;
import model.TStudyPlan;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TStudyPlanMapperImpl implements TStudyPlanMapper {
    //sqlSession session
    //SqlSessionFactory
    private SqlSession session = null;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer studyPlanid) {
        session = sqlSessionFactory.openSession();
        int row = session.delete("dao.TStudyPlanMapper.deleteByPrimaryKey", studyPlanid);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insert(TStudyPlan record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TStudyPlanMapper.insert", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int insertSelective(TStudyPlan record) {
        session = sqlSessionFactory.openSession();
        int row = session.insert("dao.TStudyPlanMapper.insertSelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public TStudyPlan selectByPrimaryKey(Integer studyPlanid) {
        session = sqlSessionFactory.openSession();
        TStudyPlan StudyPlan = session.selectOne("dao.TStudyPlanMapper.selectByPrimaryKey", studyPlanid);
        session.close();

        return StudyPlan;
    }

    @Override
    public List<TStudyPlan> selectBySelective(TStudyPlan record) {
        session = sqlSessionFactory.openSession();
        List<TStudyPlan> list = session.selectList("dao.TStudyPlanMapper.selectBySelective", record);
        session.close();
        return list;
    }

    @Override
    public int updateByPrimaryKeySelective(TStudyPlan record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TStudyPlanMapper.updateByPrimaryKeySelective", record);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int updateByPrimaryKey(TStudyPlan record) {
        session = sqlSessionFactory.openSession();

        int row = session.update("dao.TStudyPlanMapper.updateByPrimaryKey", record);
        session.commit();
        session.close();
        return row;
    }
}
