package impl;

import model.TUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceImplTest {
    @Autowired
    private UserServiceImpl userService;

    @Test
    public void deleteUser() {
        int row = userService.deleteUser(1);
        System.out.println(row);

    }

    @Test
    public void insertUser() {
        TUser user = new TUser();
        user.setUsername("yvon");
        user.setEmail("yvon@gmail.om");
        user.setPassword("1111");
        user.setStatus("active");

        boolean row = userService.registerUser(user);
        System.out.println(row);

    }

    @Test
    public void selectByUserId() {
        TUser user = userService.getTUserByid(1);
        System.out.println(user);
    }

    @Test
    public void updateUser() {
        TUser user = new TUser();
        user.setUserid(1);
        user.setUsername("yves");

        boolean row = userService.modifyUser(user);
        System.out.println(row);
    }
}