package service;

import model.TApplication;

import java.util.List;

public interface ApplicationService {
    public int deleteApplication(String applicationno);

    public int insertApplication(TApplication record);
    public List<TApplication> getApplicationsSelective(TApplication record);
    public TApplication selectApplicationById(String applicationno);

    public int updateApplication(TApplication record);
}
