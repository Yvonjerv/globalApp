package impl;

import mapperImpl.TMajorMapperImpl;
import model.TMajor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.MajorService;

import java.util.List;

@Service
public class MajorServiceImpl implements MajorService {
    @Autowired
    private TMajorMapperImpl tMajorMapper;

    @Override
    public int deleteMajor(int majorid) {
        return tMajorMapper.deleteByPrimaryKey(majorid);
    }

    @Override
    public int insertMajor(TMajor record) {
        return tMajorMapper.insertSelective(record);
    }

    @Override
    public TMajor selectMajorById(int majorid) {
        return tMajorMapper.selectByPrimaryKey(majorid);
    }

    @Override
    public List<TMajor> getMajorsSelective(TMajor record) {
        return tMajorMapper.selectBySelective(record);
    }

    @Override
    public int updateMajor(TMajor record) {
        return tMajorMapper.updateByPrimaryKeySelective(record);
    }
}
