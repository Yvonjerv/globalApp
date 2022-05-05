package service;

import model.TLocation;

import java.util.List;

public interface LocationService {
    public List<TLocation> select();
    public List<TLocation> getLocationsSelective(TLocation record);
    public TLocation selectLocationById(int locationId);
}
