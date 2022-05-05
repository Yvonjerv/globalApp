package impl;

import mapperImpl.TCurrentlyInChinaMapperImpl;
import model.TCurrentlyInChina;
import model.TCurrentlyInChina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CurrentlyInChinaService;

import java.util.List;

@Service
public class CurrentlyInChinaServiceImpl implements CurrentlyInChinaService {
    @Autowired
    private TCurrentlyInChinaMapperImpl tCurrentlyInChinaMapper;
    @Override
    public int deleteCurrentlyInChina(int currid) {
        return tCurrentlyInChinaMapper.deleteByPrimaryKey(currid);
    }

    @Override
    public int insertCurrentlyInChina(TCurrentlyInChina record) {
        return tCurrentlyInChinaMapper.insertSelective(record);
    }

    @Override
    public List<TCurrentlyInChina> getCurrentlyInChinasSelective(TCurrentlyInChina record) {
        return tCurrentlyInChinaMapper.selectBySelective(record);
    }

    @Override
    public TCurrentlyInChina selectCurrentlyInChinaById(int currid) {
        return tCurrentlyInChinaMapper.selectByPrimaryKey(currid);
    }

    @Override
    public int updateCurrentlyInChina(TCurrentlyInChina record) {
        return tCurrentlyInChinaMapper.updateByPrimaryKeySelective(record);
    }
}
