package controller;

import model.TRelative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.RelativeService;

import java.util.List;

@Controller
@RequestMapping(value = "/recommender")
public class RecommendersController {

    @Autowired
    private RelativeService relativeService;

    @RequestMapping(value = "/editrecommender")
    public String editRecommender(
            //1
            int relativeid_1, String name_1,
            String relationship_1, String workplace_1,
            String nationality_1, String occupation_1,
            String mobile_1, String address_1,
            String email_1, String relativetype_1,
            //2
            int relativeid_2, String name_2,
            String relationship_2, String workplace_2,
            String nationality_2, String occupation_2,
            String mobile_2, String address_2,
            String email_2, String relativetype_2, int userid, Model model
    ) {

        TRelative r_1 = new TRelative();
        r_1.setName(name_1);
        r_1.setRelationship(relationship_1);
        r_1.setWorkplace(workplace_1);
        r_1.setNationality(nationality_1);
        r_1.setOccupation(occupation_1);
        r_1.setMobile(mobile_1);
        r_1.setAddress(address_1);
        r_1.setEmail(email_1);
        r_1.setRelativetype(relativetype_1);
        r_1.setUserid(userid);

        int row_1 = 0;
        if (relativeid_1 != 0) {
            r_1.setRelativeid(relativeid_1);
            row_1 = relativeService.updateRelative(r_1);

        } else {
            row_1 = relativeService.insertRelative(r_1);
        }


        TRelative r_2 = new TRelative();
        r_2.setName(name_2);
        r_2.setRelationship(relationship_2);
        r_2.setWorkplace(workplace_2);
        r_2.setNationality(nationality_2);
        r_2.setOccupation(occupation_2);
        r_2.setMobile(mobile_2);
        r_2.setAddress(address_2);
        r_2.setEmail(email_2);
        r_2.setRelativetype(relativetype_2);
        r_2.setUserid(userid);

        int row_2 = 0;
        if (relativeid_1 != 0) {
            r_2.setRelativeid(relativeid_1);
            row_2 = relativeService.updateRelative(r_2);

        } else {
            row_1 = relativeService.insertRelative(r_2);
        }


        if (row_1 > 0 && row_2 > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }

    @RequestMapping(value = "/getrecommender")
    public String getRecommenders(String position, int userid, Model mode1, Model model){

        TRelative relative = new TRelative();
        relative.setUserid(userid);
        relative.setRelativetype("recommender");

        List<TRelative> list = relativeService.getRelativesSelective(relative);

                model.addAttribute("recommender1", list.get(0));
                mode1.addAttribute("recommender2", list.get(1));
                return "index";
    }
}
