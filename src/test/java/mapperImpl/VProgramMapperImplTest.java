package mapperImpl;


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
public class VProgramMapperImplTest {
@Autowired
private VProgramMapperImpl programMapper;
    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void select() {
        List<VProgram> list = programMapper.select();
        System.out.println(list);

    }

    @Test
    public void selectBySelectiveAnd() {
        VProgram program =new VProgram();
        program.setCity("Guangzhou");
        List<VProgram> list = programMapper.selectBySelectiveAnd(program);
        System.out.println(list);
    }

    @Test
    public void selectBySelectiveOr() {
    }
}