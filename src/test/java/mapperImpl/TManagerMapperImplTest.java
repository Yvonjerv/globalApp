package mapperImpl;

import model.TManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TManagerMapperImplTest {
@Autowired
private TManagerMapperImpl managerMapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {

    }

    @Test
    public void selectByPrimaryKey() {

    }

    @Test
    public void selectBySelective() {
        TManager manager = new TManager();
        manager.setManagername("yvon");
        manager.setPassword("1234");
        List<TManager> list = managerMapper.selectBySelective(manager);

        for (TManager m: list
        ) {
            System.out.println(manager.getManagername());
        }
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}