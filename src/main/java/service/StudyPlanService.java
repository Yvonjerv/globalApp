package service;

import model.TStudyPlan;


import java.util.List;

public interface StudyPlanService {
    public int deleteStudyPlan(int studyPlanid);

    public int insertStudyPlan(TStudyPlan record);

    public TStudyPlan selectStudyPlanById(int studyPlanid);
    public List<TStudyPlan> getStudyPlansSelective(TStudyPlan record);
    public int updateStudyPlan(TStudyPlan record);
}
