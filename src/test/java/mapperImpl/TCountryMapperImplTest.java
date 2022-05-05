package mapperImpl;

import model.TCountry;
import model.TUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TCountryMapperImplTest {
    @Autowired
    private TCountryMapperImpl tCountryMapperImpl;
    @Test
    public void select() {

        List<TCountry> list = tCountryMapperImpl.select();
        System.out.println(list);
    }
}