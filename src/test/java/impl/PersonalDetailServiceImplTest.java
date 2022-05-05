package impl;

import model.TPersonalDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class PersonalDetailServiceImplTest {
    @Autowired
    private PersonalDetailServiceImpl personalDetailService;

    @Test
    public void deletePersonalDetail() {
    }

    @Test
    public void insertPersonalDetail() {
        TPersonalDetail personalDetail = new TPersonalDetail();
        personalDetail.setFirstname("yvon");
        personalDetail.setHealthstatus("excellent");
        personalDetail.setLastname("jksjk");
        personalDetail.setBirthcountry("Togo");
    int row = personalDetailService.insertPersonalDetail(personalDetail);
        System.out.println(row);
    }

    @Test
    public void selectPersonalDetailById() {
       TPersonalDetail personalDetail = personalDetailService.selectPersonalDetailById(1);
        System.out.println(personalDetail.getFirstname());
    }

    @Test
    public void updatePersonDetail() {
    }
}