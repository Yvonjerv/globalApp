package impl;

import mapperImpl.TStudyPlanMapperImpl;
import model.TStudyPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.StudyPlanService;

import java.util.List;

@Service
public class StudyPlanServiceImpl implements StudyPlanService
{
    @Autowired
    private TStudyPlanMapperImpl tStudyPlanMapper;

    @Override
    public int deleteStudyPlan(int studyPlanid) {
        return tStudyPlanMapper.deleteByPrimaryKey(studyPlanid);
    }

    @Override
    public int insertStudyPlan(TStudyPlan record) {
        return tStudyPlanMapper.insertSelective(record);
    }

    @Override
    public TStudyPlan selectStudyPlanById(int studyPlanid) {
        return tStudyPlanMapper.selectByPrimaryKey(studyPlanid);
    }

    @Override
    public List<TStudyPlan> getStudyPlansSelective(TStudyPlan record) {
        return tStudyPlanMapper.selectBySelective(record);
    }

    @Override
    public int updateStudyPlan(TStudyPlan record) {
        return tStudyPlanMapper.updateByPrimaryKeySelective(record);
    }
}
