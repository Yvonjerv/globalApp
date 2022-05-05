package impl;

import mapperImpl.TEmployBackgroundMapperImpl;
import model.TEmployBackground;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.EmployBackgroundService;

import java.util.List;

@Service
public class EmployBackgroundServiceImpl implements EmployBackgroundService {

    @Autowired
    private TEmployBackgroundMapperImpl tEmployBackgroundMapper;

    @Override
    public int deleteEmployBackground(int eduBackgroundid) {
        return tEmployBackgroundMapper.deleteByPrimaryKey(eduBackgroundid);
    }

    @Override
    public int insertEmployBackground(TEmployBackground record) {
        return tEmployBackgroundMapper.insertSelective(record);
    }

    @Override
    public TEmployBackground selectEmployBackgroundById(int eduBackgroundid) {
        return tEmployBackgroundMapper.selectByPrimaryKey(eduBackgroundid);
    }

    @Override
    public List<TEmployBackground> getEmployBackgroundsSelective(TEmployBackground record) {
        return tEmployBackgroundMapper.selectBySelective(record);
    }

    @Override
    public int updateEmployBackground(TEmployBackground record) {
        return tEmployBackgroundMapper.updateByPrimaryKeySelective(record);
    }
}
