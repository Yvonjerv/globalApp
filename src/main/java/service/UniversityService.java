package service;

import model.TUniversity;

import java.util.List;

public interface UniversityService {
    public int deleteUniversity(int universityid);

    public int insertUniversity(TUniversity record);

    public TUniversity selectUniversityById(int universityid);

    public List<TUniversity> getUniversitiesSelective(TUniversity record);


    public int updateUniversity(TUniversity record);
}
