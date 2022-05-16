package controller;

import model.TCountry;
import model.TLanguage;
import model.TPersonalDetail;
import model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CountryService;
import service.LanguageService;
import service.PersonalDetailService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/personalinfo")
public class PersonalInfoController {

    @Autowired
    private PersonalDetailService personalDetailService;

    @Autowired
    private CountryService countryService;
    @Autowired
    private LanguageService languageService;

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
        if (personid > 0) {
            pers.setPersonid(personid);
            row = personalDetailService.updatePersonDetail(pers);
        } else {
            row = personalDetailService.insertPersonalDetail(pers);
        }

        if (row > 0) {
            return "eduBackground";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }

    @RequestMapping(value = "/getpersonalinfo")
    private String getpersonalinfo( Model model, Model cModel,Model lModel, HttpServletRequest req) {
        TPersonalDetail personalDetail = new TPersonalDetail();
        HttpSession session = req.getSession();
        TUser loginuser = (TUser) session.getAttribute("loginuser");
        personalDetail.setUserid(loginuser.getUserid());
        List<TPersonalDetail> list = personalDetailService.getPersonalDetailsSelective(personalDetail);
        if(list.size()>0) {
            model.addAttribute("pers", list.get(0));
        }

        List<TCountry> clist = countryService.getCountries();
        cModel.addAttribute("countries", clist);
        List<TLanguage> llist = languageService.getLanguagesSelective(null);
        lModel.addAttribute("languages", llist);

        return "personalDetail";
    }

    @RequestMapping(value = "/countries")
    private String getCountries(Model model){
        List<TCountry> list = countryService.getCountries();
        model.addAttribute("countries", list);
        return "personsalDetail.jsp";
    }

}
