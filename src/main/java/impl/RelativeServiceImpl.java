package impl;

import mapperImpl.TRelativeMapperImpl;
import model.TRelative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.RelativeService;

import java.util.List;

@Service
public class RelativeServiceImpl implements RelativeService {
    @Autowired
    private TRelativeMapperImpl tRelativeMapper;

    @Override
    public int deleteRelative(int relativeid) {
        return tRelativeMapper.deleteByPrimaryKey(relativeid);
    }

    @Override
    public int insertRelative(TRelative record) {
        return tRelativeMapper.insertSelective(record);
    }

    @Override
    public TRelative selectRelativeById(int relativeid) {
        return tRelativeMapper.selectByPrimaryKey(relativeid);
    }

    @Override
    public List<TRelative> getRelativesSelective(TRelative record) {
        return tRelativeMapper.selectBySelective(record);
    }

    @Override
    public int updateRelative(TRelative record) {
        return tRelativeMapper.updateByPrimaryKeySelective(record);
    }
}
