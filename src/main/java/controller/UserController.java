package controller;

import model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register") //: /user/register
    public String registerUser(String username, String email, String password,Model model) {
        TUser user = new TUser();
        user.setUsername(username);
        user.setPassword(password);
        user.setStatus("active");

        boolean row = userService.registerUser(user);

        if(row){
            return "login";
        }else  {
            model.addAttribute("errMsg", "The user account and password are not correct");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }

    @RequestMapping(value = "/login") //: /user/login
    public String login(String userid, String password, Model model, HttpServletRequest req) {
        TUser user = userService.login(userid, password);

        if (user == null) {
            model.addAttribute("errMsg", "The user account and password are not correct");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        } else {
            model.addAttribute("loginuser", user);
            HttpSession session = req.getSession();
            session.setAttribute("loginuser", user);
            return "redirect:../university/index";
        }
    }

    @RequestMapping(value = "/logout") //: /user/logout
    public String logout(HttpServletRequest req) {

        HttpSession session = req.getSession();
        session.removeAttribute("loginuser");
        return "redirect:../universitymanage/index";
    }
}
