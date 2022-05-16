package controller;


import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/background")
public class BackgroundController {
    @Autowired
    private EduBackgroundService eduBackgroundService;

    @Autowired
    private EmployBackgroundService employBackgroundService;

    @Autowired
    private EnglishProfService englishProfService;

    @Autowired
    private ChineseProfService chineseProfService;

    @RequestMapping(value = "/editEdu")
    public String editEdu(int userid, Model model,
                          //eduBackground
                          int educationid, String fromdate,
                          String todate, String country,
                          String institution, String field,
                          String degree) {
        TEduBackground eduBackground = new TEduBackground();
        eduBackground.setFromdate(fromdate);
        eduBackground.setTodate(todate);
        eduBackground.setCountry(country);
        eduBackground.setInstitution(institution);
        eduBackground.setField(field);
        eduBackground.setDegree(degree);
        eduBackground.setUserid(userid);

        int row;
        if (educationid != 0) {
            eduBackground.setEducationid(educationid);
            row = eduBackgroundService.updateEduBackground(eduBackground);
        } else {
            row = eduBackgroundService.insertEduBackground(eduBackground);
        }

        if (row > 0) {
            return "eduBackground";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }

    //emplobackground
    @RequestMapping(value = "/getemploy")
    public String getEmploy(int userid, Model model) {

        TEmployBackground employBackground = new TEmployBackground();
        employBackground.setUserid(userid);

        List<TEmployBackground> list_employ = employBackgroundService.getEmployBackgroundsSelective(employBackground);
        model.addAttribute("employlist", list_employ);
        return "index";
    }

    //emplobackground
    @RequestMapping(value = "/editEmploy")
    public String editEmploy(int userid, Model model,
                             //employBackground
                             int employmentid, String fromdate,
                             String todate, String company,
                             String jobtitle) {
        TEmployBackground employBackground = new TEmployBackground();
        employBackground.setFromdate(fromdate);
        employBackground.setTodate(todate);
        employBackground.setUserid(userid);
        employBackground.setCompany(company);
        employBackground.setJobtitle(jobtitle);

        int row;
        if (employmentid != 0) {
            employBackground.setEmploymentid(employmentid);
            row = employBackgroundService.updateEmployBackground(employBackground);
        } else {
            row = employBackgroundService.insertEmployBackground(employBackground);
        }

        if (row > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }

    //edubackground
    @RequestMapping(value = "/getedu")
    public String getEdu(int userid, Model model, HttpServletRequest req) {

        TEduBackground eduBackground = new TEduBackground();
        HttpSession session = req.getSession();
        TUser loginuser = (TUser) session.getAttribute("loginuser");
        eduBackground.setUserid(loginuser.getUserid());
        List<TEduBackground> list_edu = eduBackgroundService.getEduBackgroundsSelective(eduBackground);
        if(list_edu.size()>0) {

            model.addAttribute("emplolist", list_edu);
        }
        return "eduBackground";
    }

    //englishProf
    @RequestMapping(value = "/editlanguage")
    public String editLaguage(int userid, Model model,
                              //english
                              int englishprofid,
                              String level, String toefl, String gre, String ietls,
                              String gmat, String duolingo, String other,
                              //chinese
                              int chineseprofid, String hsklevel, String hskklevel,
                              String hskscore, String hskdate, String hsktickedno,
                              String hskkscore, String hskkdate
    ) {


        TChineseProf chineseProf = new TChineseProf();
        chineseProf.setHskdate(hskdate);
        chineseProf.setHsklevel(hsklevel);
        chineseProf.setHskscore(hskscore);
        chineseProf.setHsktickedno(hsktickedno);
        chineseProf.setHskkdate(hskkdate);
        chineseProf.setHskklevel(hskklevel);
        chineseProf.setHskkscore(hskkscore);
        chineseProf.setUserid(userid);

        int row_chinese;
        if (chineseprofid > 0) {
            chineseProf.setChineseprofid(chineseprofid);
            row_chinese = chineseProfService.updateChineseProf(chineseProf);
        } else {
            row_chinese = chineseProfService.insertChineseProf(chineseProf);
        }


        //English
        TEnglishProf englishProf = new TEnglishProf();
        englishProf.setLevel(level);
        englishProf.setToefl(toefl);
        englishProf.setGre(gre);
        englishProf.setIetls(ietls);
        englishProf.setGmat(gmat);
        englishProf.setDuolingo(duolingo);
        englishProf.setOther(other);
        englishProf.setUserid(userid);

        int row_eng;
        if (englishprofid > 0) {
            englishProf.setEnglishprofid(englishprofid);
            row_eng = englishProfService.updateEnglishProf(englishProf);
        } else {
            row_eng = englishProfService.insertEnglishProf(englishProf);
        }

        if (row_chinese > 0 && row_eng > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }


}
