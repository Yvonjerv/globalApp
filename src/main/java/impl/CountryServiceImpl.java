package impl;

import mapperImpl.TCountryMapperImpl;
import model.TCountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CountryService;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private TCountryMapperImpl tCountryMapperImpl;


    @Override
    public List<TCountry> getCountries() {
        List<TCountry> list = tCountryMapperImpl.select();
        return list;
    }

    @Override
    public TCountry getCountryById(String alpha) {
        return tCountryMapperImpl.selectByPrimaryKey(alpha);
    }
}
