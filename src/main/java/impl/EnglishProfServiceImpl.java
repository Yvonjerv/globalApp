package impl;

import mapperImpl.TEnglishProfMapperImpl;
import model.TEnglishProf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.EnglishProfService;

import java.util.List;

@Service
public class EnglishProfServiceImpl implements EnglishProfService {
    @Autowired
    private TEnglishProfMapperImpl tEnglishProfMapper;

    @Override
    public int deleteEnglishProf(int englishProfid) {
        return tEnglishProfMapper.deleteByPrimaryKey(englishProfid);
    }

    @Override
    public int insertEnglishProf(TEnglishProf record) {
        return tEnglishProfMapper.insertSelective(record);
    }

    @Override
    public List<TEnglishProf> getEnglishProfsSelective(TEnglishProf record) {
        return tEnglishProfMapper.selectBySelective(record);
    }

    @Override
    public TEnglishProf selectEnglishProfById(int englishProfid) {
        return tEnglishProfMapper.selectByPrimaryKey(englishProfid);
    }

    @Override
    public int updateEnglishProf(TEnglishProf record) {
        return tEnglishProfMapper.updateByPrimaryKeySelective(record);
    }
}
