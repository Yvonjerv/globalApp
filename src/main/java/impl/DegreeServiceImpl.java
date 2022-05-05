package impl;


import mapperImpl.TDegreeMapperImpl;
import model.TDegree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DegreeService;

import java.util.List;
@Service
public class DegreeServiceImpl implements DegreeService {

    @Autowired
    private TDegreeMapperImpl tDegreeMapper;

    @Override
    public List<TDegree> getDegrees() {
        List<TDegree> list = tDegreeMapper.select();

        return list;
    }

    @Override
    public List<TDegree> getDegreesSelective(TDegree record) {
        return tDegreeMapper.selectBySelective(record);
    }

    @Override
    public TDegree getDegreeById(int degreeid) {
        return tDegreeMapper.selectByPrimaryKey(degreeid);
    }
}
