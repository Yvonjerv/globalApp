package impl;

import mapperImpl.TAwardMapperImpl;
import model.TAward;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AwardService;

import java.util.List;

@Service
public class AwardServiceImpl implements AwardService {
    @Autowired
    private TAwardMapperImpl tAwardMapper;

    @Override
    public int deleteAward(int awardid) {
        return tAwardMapper.deleteByPrimaryKey(awardid);
    }

    @Override
    public int insertAward(TAward record) {
        return tAwardMapper.insertSelective(record);
    }

    @Override
    public List<TAward> getAwardsSelective(TAward record) {
        return tAwardMapper.selectBySelective(record);
    }

    @Override
    public TAward selectAwardById(int awardid) {
        return tAwardMapper.selectByPrimaryKey(awardid);
    }

    @Override
    public int updateAward(TAward record) {
        return tAwardMapper.updateByPrimaryKeySelective(record);
    }
}
