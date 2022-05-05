package impl;

import mapperImpl.TUniversityMapperImpl;
import model.TUniversity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UniversityService;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService {
    @Autowired
    private TUniversityMapperImpl tUniversityMapper;

    @Override
    public int deleteUniversity(int universityid) {
        return tUniversityMapper.deleteByPrimaryKey(universityid);
    }

    @Override
    public int insertUniversity(TUniversity record) {
        return tUniversityMapper.insertSelective(record);
    }

    @Override
    public TUniversity selectUniversityById(int universityid) {
        return tUniversityMapper.selectByPrimaryKey(universityid);
    }

    @Override
    public List<TUniversity> getUniversitiesSelective(TUniversity record) {
        return tUniversityMapper.selectBySelective(record);
    }

    @Override
    public int updateUniversity(TUniversity record) {
        return tUniversityMapper.updateByPrimaryKeySelective(record);
    }
}
