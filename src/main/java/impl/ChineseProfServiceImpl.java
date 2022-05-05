package impl;

import mapperImpl.TChineseProfMapperImpl;
import model.TChineseProf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ChineseProfService;

import java.util.List;

@Service
public class ChineseProfServiceImpl implements ChineseProfService {
    @Autowired
    private TChineseProfMapperImpl tChineseProfMapper;

    @Override
    public int deleteChineseProf(int chineseProfid) {
        return tChineseProfMapper.deleteByPrimaryKey(chineseProfid);
    }

    @Override
    public List<TChineseProf> getChineseProfsSelective(TChineseProf record) {
        return tChineseProfMapper.selectBySelective(record);
    }

    @Override
    public int insertChineseProf(TChineseProf record) {
        return tChineseProfMapper.insertSelective(record);
    }

    @Override
    public TChineseProf selectChineseProfById(int chineseProfid) {
        return tChineseProfMapper.selectByPrimaryKey(chineseProfid);
    }

    @Override
    public int updateChineseProf(TChineseProf record) {
        return tChineseProfMapper.updateByPrimaryKeySelective(record);
    }
}
