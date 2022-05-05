package controller;


import model.TAttachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.AttachmentService;

@Controller
@RequestMapping(value = "/attachment")
public class AttachmentController {

    @Autowired
    private AttachmentService attachmentService;

    @RequestMapping(value = "/addAttachment")
    public String addAttachment(int attachmentid,int userid, String applicationno, String passport,
                                String visa, String highestdegree, String transcript, String recommendationletter1,
                                String recommendationletter2, String physicalexamination,
                                String studyplan, String bankstatement, String englishproficiency, String chineseproficiency,
                                String noncriminal, String cv, String other, Model model) {

        TAttachment att = new TAttachment();
        att.setApplicationno(applicationno);
        att.setUserid(userid);
        att.setPassport(passport);
        att.setVisa(visa);
        att.setHighestdegree(highestdegree);
        att.setTranscript(transcript);
        att.setRecommendationletter1(recommendationletter1);
        att.setRecommendationletter2(recommendationletter2);
        att.setPhysicalexamination(physicalexamination);
        att.setStudyplan(studyplan);
        att.setBankstatement(bankstatement);
        att.setEnglishproficiency(englishproficiency);
        att.setNoncriminal(noncriminal);
        att.setCv(cv);
        att.setOther(other);

        int row ;
        if (attachmentid!=0){
            att.setAttachmentid(attachmentid);
            row = attachmentService.updateAttachment(att);

        }else{
            row = attachmentService.insertAttachment(att);
        }



        if (row > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }

    }


    @RequestMapping(value = "/deleteattachment")
    public String deleteAttachment(int attachmentid, Model model) {
        int row = attachmentService.deleteAttachment(attachmentid);

        if (row > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }

    }
}
