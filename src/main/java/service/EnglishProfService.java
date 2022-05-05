package service;

import model.TEnglishProf;

import java.util.List;

public interface EnglishProfService {
    public int deleteEnglishProf(int englishProfid);

    public int insertEnglishProf(TEnglishProf record);
    public List<TEnglishProf> getEnglishProfsSelective(TEnglishProf record);
    public TEnglishProf selectEnglishProfById(int englishProfid);

    public int updateEnglishProf(TEnglishProf record);
}
