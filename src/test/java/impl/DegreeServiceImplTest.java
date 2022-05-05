package impl;

import mapperImpl.TDegreeMapperImpl;
import model.TCountry;
import model.TDegree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class DegreeServiceImplTest {
    @Autowired
    private DegreeServiceImpl degreeService;
    @Test
    public void getDegrees() {
        List<TDegree> list = degreeService.getDegrees();
        System.out.println(list);
    }

    @Test
    public void getDegreeById() {
        TDegree degree = degreeService.getDegreeById(1);
        System.out.println(degree);
    }
}