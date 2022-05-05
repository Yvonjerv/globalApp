package impl;

import mapperImpl.TCountryMapperImpl;
import model.TCountry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CountryServiceImplTest {
    @Autowired
    private CountryServiceImpl countryServiceImpl;
    @Test
    public void getCountries() {
        List<TCountry> list = countryServiceImpl.getCountries();
        System.out.println(list);
    }

    @Test
    public void getCountryById() {
        TCountry country = countryServiceImpl.getCountryById("ABW");
    }
}