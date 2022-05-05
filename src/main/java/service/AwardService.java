package service;

import model.TAward;

import java.util.List;

public interface AwardService {
    public int deleteAward(int awardid);

    public int insertAward(TAward record);
    public List<TAward> getAwardsSelective(TAward record);
    public TAward selectAwardById(int awardid);

    public int updateAward(TAward record);
}
