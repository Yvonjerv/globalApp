package service;

import model.TChineseProf;

import java.util.List;

public interface ChineseProfService {

    public int deleteChineseProf(int chineseProfid);
    public List<TChineseProf> getChineseProfsSelective(TChineseProf record);
    public int insertChineseProf(TChineseProf record);

    public TChineseProf selectChineseProfById(int chineseProfid);

    public int updateChineseProf(TChineseProf record);
}
