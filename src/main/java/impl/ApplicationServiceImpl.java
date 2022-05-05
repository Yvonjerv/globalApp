package impl;

import mapperImpl.TApplicationMapperImpl;
import model.TApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ApplicationService;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private TApplicationMapperImpl applicationMapper;
    @Override
    public int deleteApplication(String applicationno) {
        return applicationMapper.deleteByPrimaryKey(applicationno);
    }

    @Override
    public int insertApplication(TApplication record) {
        return applicationMapper.insertSelective(record);
    }

    @Override
    public List<TApplication> getApplicationsSelective(TApplication record) {
        return applicationMapper.selectBySelective(record);
    }

    @Override
    public TApplication selectApplicationById(String applicationno) {
        return applicationMapper.selectByPrimaryKey(applicationno);
    }

    @Override
    public int updateApplication(TApplication record) {

        return applicationMapper.updateByPrimaryKeySelective(record);
    }
}
