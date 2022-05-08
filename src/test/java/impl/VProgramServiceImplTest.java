package impl;

import model.VProgram;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class VProgramServiceImplTest {
    @Autowired
    private VProgramServiceImpl vProgramService;

    @Test
    public void getPrograms() {
    List<VProgram> list = vProgramService.getPrograms();

    System.out.println(list);
    }

    @Test
    public void selectProgramById() {
    }

    @Test
    public void getProgramsSelectiveAnd() {
    }

    @Test
    public void getProgramsSelectiveOr() {
    }
}