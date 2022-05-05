package impl;


import mapperImpl.TLocationMapperImpl;
import model.TLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.LocationService;

import java.util.List;
@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private TLocationMapperImpl tLocationMapper;
    @Override
    public List<TLocation> select() {
        List<TLocation> list = tLocationMapper.select();
        return list;
    }

    @Override
    public List<TLocation> getLocationsSelective(TLocation record) {
        return tLocationMapper.selectBySelective(record);
    }

    @Override
    public TLocation selectLocationById(int locationId) {
        return tLocationMapper.selectByPrimaryKey(locationId);
    }
}
