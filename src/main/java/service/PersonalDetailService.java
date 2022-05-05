package service;

import model.TPersonalDetail;

import java.util.List;

public interface PersonalDetailService {

    public int deletePersonalDetail(Integer personid);

    public int insertPersonalDetail(TPersonalDetail record);

    public TPersonalDetail selectPersonalDetailById(Integer personid);
    public List<TPersonalDetail> getPersonalDetailsSelective(TPersonalDetail record);
    public int updatePersonDetail(TPersonalDetail record);

}
