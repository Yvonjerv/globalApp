package impl;

import model.TManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ManagerServiceImplTest {
    @Autowired
    private ManagerServiceImpl managerService;


    @Test
    public void deleteManager() {
    }

    @Test
    public void login() {
      TManager manager=   managerService.login("yvon", "1234");
        System.out.println( manager.getManagername());
    }

    @Test
    public void isManagernameValid() {
    }

    @Test
    public void registerManager() {
        TManager manager = new TManager();
        manager.setManagername("rreeeee");
        manager.setPassword("123123");
        boolean row = managerService.registerManager(manager);
        System.out.println(row);
    }

    @Test
    public void modifyManager() {
    }

    @Test
    public void getTManagerById() {
    }
}