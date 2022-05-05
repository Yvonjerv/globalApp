package impl;

import mapperImpl.TEduBackgroundMapperImpl;
import model.TEduBackground;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.EduBackgroundService;

import java.util.List;

@Service
public class EduBackgroundServiceImpl implements EduBackgroundService {
    @Autowired
    private TEduBackgroundMapperImpl tEduBackgroundMapper;

    @Override
    public int deleteEduBackground(int eduBackgroundid) {
        return tEduBackgroundMapper.deleteByPrimaryKey(eduBackgroundid);
    }

    @Override
    public int insertEduBackground(TEduBackground record) {
        return tEduBackgroundMapper.insertSelective(record);
    }

    @Override
    public List<TEduBackground> getEduBackgroundsSelective(TEduBackground record) {
        return tEduBackgroundMapper.selectBySelective(record);
    }

    @Override
    public TEduBackground selectEduBackgroundById(int eduBackgroundid) {
        return tEduBackgroundMapper.selectByPrimaryKey(eduBackgroundid);
    }

    @Override
    public int updateEduBackground(TEduBackground record) {
        return tEduBackgroundMapper.updateByPrimaryKeySelective(record);
    }
}
