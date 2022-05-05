package service;

import model.TEduBackground;

import java.util.List;

public interface EduBackgroundService {
    public int deleteEduBackground(int eduBackgroundid);

    public int insertEduBackground(TEduBackground record);
    public List<TEduBackground> getEduBackgroundsSelective(TEduBackground record);
    public TEduBackground selectEduBackgroundById(int eduBackgroundid);

    public int updateEduBackground(TEduBackground record);
}
