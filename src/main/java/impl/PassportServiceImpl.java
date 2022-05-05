package impl;

import mapperImpl.TPassportMapperImpl;
import model.TPassport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PassportService;

import java.util.List;

@Service
public class PassportServiceImpl implements PassportService {
    @Autowired
    private TPassportMapperImpl tPassportMapper;

    @Override
    public int deletePassport(int passportid) {
        return tPassportMapper.deleteByPrimaryKey(passportid);
    }

    @Override
    public int insertPassport(TPassport record) {
        return tPassportMapper.insertSelective(record);
    }

    @Override
    public TPassport selectPassportById(int passportid) {
        return tPassportMapper.selectByPrimaryKey(passportid);
    }

    @Override
    public List<TPassport> getPassportsSelective(TPassport record) {
        return tPassportMapper.selectBySelective(record);
    }

    @Override
    public int updatePassport(TPassport record) {
        return tPassportMapper.updateByPrimaryKeySelective(record);
    }
}
