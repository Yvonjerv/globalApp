package impl;

import mapperImpl.TPersonalDetailMapperImpl;
import model.TPersonalDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PersonalDetailService;

import java.util.List;

@Service
public class PersonalDetailServiceImpl implements PersonalDetailService {
    @Autowired
    private TPersonalDetailMapperImpl personalDetailMapper;

    @Override
    public int deletePersonalDetail(Integer personid) {
        return personalDetailMapper.deleteByPrimaryKey(personid);
    }

    @Override
    public int insertPersonalDetail(TPersonalDetail record) {
        return personalDetailMapper.insertSelective(record);
    }

    @Override
    public TPersonalDetail selectPersonalDetailById(Integer personid) {
        return personalDetailMapper.selectByPrimaryKey(personid);
    }

    @Override
    public List<TPersonalDetail> getPersonalDetailsSelective(TPersonalDetail record) {
        return personalDetailMapper.selectBySelective(record);
    }

    @Override
    public int updatePersonDetail(TPersonalDetail record) {
        return personalDetailMapper.updateByPrimaryKeySelective(record);
    }
}
