package controller;

import model.TCountry;
import model.TPersonalDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CountryService;
import service.PersonalDetailService;

import java.util.List;

@Controller
@RequestMapping(value = "/personalinfo")
public class PersonalInfoController {

    @Autowired
    private PersonalDetailService personalDetailService;

    @Autowired
    private CountryService countryService;

    @RequestMapping(value = "/editpersonalinfo")
    public String editPersonalinfo(int personid, String firstname, String lastname, String chinesename, String gender,
                                   String religion, String marital, String nationality, String dateofbirth,
                                   String birthplace, String birthcountry, String nativelang, String highestdegree,
                                   String institution, String occupation, String healthstatus, String hobby,
                                   String photourl, int userid, Model model) {

        TPersonalDetail pers = new TPersonalDetail();
        pers.setFirstname(firstname);
        pers.setLastname(lastname);
        pers.setChinesename(chinesename);
        pers.setGender(gender);
        pers.setReligion(religion);
        pers.setNationality(nationality);
        pers.setMarital(marital);
        pers.setDateofbirth(dateofbirth);
        pers.setBirthplace(birthplace);
        pers.setBirthcountry(birthcountry);
        pers.setNativelang(nativelang);
        pers.setHighestdegree(highestdegree);
        pers.setInstitution(institution);
        pers.setOccupation(occupation);
        pers.setHealthstatus(healthstatus);
        pers.setHobby(hobby);
        pers.setPhotourl(photourl);
        pers.setUserid(userid);


        int row;
        if (personid != 0) {
            pers.setPersonid(personid);
            row = personalDetailService.updatePersonDetail(pers);
        } else {
            row = personalDetailService.insertPersonalDetail(pers);
        }

        if (row > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }

    @RequestMapping(value = "/getpersonalinfo")
    private String getpersonalinfo(int userid, Model model) {
        TPersonalDetail personalDetail = new TPersonalDetail();
        personalDetail.setUserid(userid);
        List<TPersonalDetail> list = personalDetailService.getPersonalDetailsSelective(personalDetail);
        model.addAttribute("pers", list.get(0));

        return "index";
    }

    @RequestMapping(value = "/countries")
    private void getCountries(Model model){
        List<TCountry> list = countryService.getCountries();
        model.addAttribute("countries", list);
    }

}
