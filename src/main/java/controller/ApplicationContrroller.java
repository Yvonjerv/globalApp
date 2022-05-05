package controller;


import model.TApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ApplicationService;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

@Controller
@RequestMapping(value = "/application")
public class ApplicationContrroller {

    @Autowired
    private ApplicationService applicationService;

    @RequestMapping(value = "/addApplication")
    public String addApplication(String applicationno, int userid, int programid, int attachmentid,
                                String status, String comment, Model model) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        TApplication application = new TApplication();
        application.setUserid(userid);
        application.setProgramid(programid);
        application.setAttachmentid(attachmentid);
        application.setSubmitdate(dtf.format(now));
        application.setStatus(status);
        application.setComment(comment);

        int row ;
        if (applicationno!=null && !applicationno.equals("")){
            application.setApplicationno(applicationno);
            row = applicationService.updateApplication(application);

        }else{
            row = applicationService.insertApplication(application);
        }


        if (row > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }

    }
    @RequestMapping(value = "/deleteApplication")
    public String deleteApplication(String applicationno, Model model) {
        int row = applicationService.deleteApplication(applicationno);

        if (row > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }

    }

}
