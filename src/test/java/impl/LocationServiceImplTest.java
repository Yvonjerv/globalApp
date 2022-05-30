package impl;

import model.TLocation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class LocationServiceImplTest {
    @Autowired
    private LocationServiceImpl locationService;
    @Test
    public void select() {
        List<TLocation> list = locationService.select();
        System.out.println(list);
    }

    @Test
    public void selectLocationById() {
TLocation location = locationService.selectLocationById(2);
System.out.println(location);
    }
}