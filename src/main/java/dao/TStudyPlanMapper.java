package dao;

import model.TStudyPlan;

import java.util.List;

public interface TStudyPlanMapper {
    int deleteByPrimaryKey(Integer studyplanid);

    int insert(TStudyPlan record);

    int insertSelective(TStudyPlan record);

    TStudyPlan selectByPrimaryKey(Integer studyplanid);
    List<TStudyPlan> selectBySelective(TStudyPlan record);
    int updateByPrimaryKeySelective(TStudyPlan record);

    int updateByPrimaryKey(TStudyPlan record);
}