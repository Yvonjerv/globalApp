package controller;
import impl.ManagerServiceImpl;
import model.TManager;
import model.TUniversity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ManagerService;
import service.UniversityService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/manager")
public class ManagerController {
    @Autowired
    private ManagerServiceImpl managerService;

    @Autowired
    private UniversityService universityService;

    @RequestMapping(value = "/register") //: /manager/register
    public String registerManager(String managername,  String password, String confirmPassword, String universityKey, Model model) {
        TManager manager = new TManager();
        System.out.println("managername=" + managername+" password="+password);
        if(password.equals(confirmPassword)){
            manager.setManagername(managername);
            manager.setPassword(password);
            manager.setUniversityKey(universityKey);
            boolean row = managerService.registerManager(manager);
            if(row){
                return "login";
            }else  {
                model.addAttribute("errMsg", "The manager account and password are not correct");
                model.addAttribute("backUrl", "../views/login.jsp");
                return "errors";
            }
        }else  {
            model.addAttribute("errMsg", "Your confirm password is not same password");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }

    }

    @RequestMapping(value = "/login") //: /manager/login
    public String login(String managername, String pwd, Model model, HttpServletRequest req) {
        TManager manager = managerService.login(managername, pwd);

        TUniversity uni = new TUniversity();
        uni.setUniversityKey(manager.getUniversityKey());
             List<TUniversity> university =    universityService.getUniversitiesSelective(uni);

        if (manager == null) {
            model.addAttribute("errMsg", "The manager account and password are not correct");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        } else {
            model.addAttribute("loginmanager", manager);
            HttpSession session = req.getSession();
            session.setAttribute("loginmanager", manager);

            HttpSession sessionUni = req.getSession();
            sessionUni.setAttribute("sessionuniversity", university);

            return "redirect:../university/getuniversity?universityKey=".concat(manager.getUniversityKey());
        }
    }

    @RequestMapping(value = "/logout") //: /manager/login
    public String logout(HttpServletRequest req) {

        HttpSession session = req.getSession();
        session.removeAttribute("loginmanager");
        return "redirect:../universitymanage/index";

    }
}
