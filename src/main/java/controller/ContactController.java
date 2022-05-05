package controller;


import model.TAddress;
import model.TRelative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.AddressService;
import service.RelativeService;

import java.util.List;

@Controller
@RequestMapping(value = "/contact")
public class ContactController {

    @Autowired
    private RelativeService relativeService;
    @Autowired
    public AddressService addressService;

    @RequestMapping(value = "/editcontact")
    public String EditContact(
            //
            int addressid_delivery, String street_delivery,
            String city_delivery, String country_delivery,
            String zipcode_delivery, String mobile_delivery,
            String type_delivery, String comment_delivery,

            int addressid_home, String street_home,
            String city_home, String country_home,
            String zipcode_home, String mobile_home,
            String type_home, String comment_home,
            //
            int relativeid_financial, String name_financial,
            String relationship_financial, String workplace_financial,
            String nationality_financial, String occupation_financial,
            String mobile_financial, String address_financial,
            String email_financial, String relativetype_financial,
            //
            int relativeid_guarantor, String name_guarantor,
            String relationship_guarantor, String workplace_guarantor,
            String nationality_guarantor, String occupation_guarantor,
            String mobile_guarantor, String address_guarantor,
            String email_guarantor, String relativetype_guarantor,
            int userid, Model model) {


        //delivery Contact
        TAddress r_delivery = new TAddress();
        r_delivery.setStreet(street_delivery);
        r_delivery.setCity(city_delivery);
        r_delivery.setCountry(country_delivery);
        r_delivery.setZipcode(zipcode_delivery);
        r_delivery.setType(type_delivery);
        r_delivery.setMobile(mobile_delivery);
        r_delivery.setComment(comment_delivery);
        r_delivery.setUserid(userid);

        int row_delivery = 0;
        if (addressid_delivery != 0) {
            r_delivery.setAddressid(addressid_delivery);
            row_delivery = addressService.updateAddress(r_delivery);

        } else {
            row_delivery = addressService.insertAddress(r_delivery);
        }

        //home Contact
        //home Contact
        TAddress r_home = new TAddress();
        r_home.setStreet(street_home);
        r_home.setCity(city_home);
        r_home.setCountry(country_home);
        r_home.setZipcode(zipcode_home);
        r_home.setType(type_home);
        r_home.setMobile(mobile_home);
        r_home.setComment(comment_home);
        r_home.setUserid(userid);

        int row_home = 0;
        if (addressid_home != 0) {
            r_home.setAddressid(addressid_home);
            row_home = addressService.updateAddress(r_home);

        } else {
            row_home = addressService.insertAddress(r_home);
        }


        //financial Contact
        TRelative r_financial = new TRelative();
        r_financial.setName(name_financial);
        r_financial.setRelationship(relationship_financial);
        r_financial.setWorkplace(workplace_financial);
        r_financial.setNationality(nationality_financial);
        r_financial.setOccupation(occupation_financial);
        r_financial.setMobile(mobile_financial);
        r_financial.setAddress(address_financial);
        r_financial.setEmail(email_financial);
        r_financial.setRelativetype(relativetype_financial);
        r_financial.setUserid(userid);

        int row_financial = 0;
        if (relativeid_financial != 0) {
            r_financial.setRelativeid(relativeid_financial);
            row_financial = relativeService.updateRelative(r_financial);

        } else {
            row_financial = relativeService.insertRelative(r_financial);
        }


        //guarantor Contact
        TRelative r_guarantor = new TRelative();
        r_guarantor.setName(name_guarantor);
        r_guarantor.setRelationship(relationship_guarantor);
        r_guarantor.setWorkplace(workplace_guarantor);
        r_guarantor.setNationality(nationality_guarantor);
        r_guarantor.setOccupation(occupation_guarantor);
        r_guarantor.setMobile(mobile_guarantor);
        r_guarantor.setAddress(address_guarantor);
        r_guarantor.setEmail(email_guarantor);
        r_guarantor.setRelativetype(relativetype_guarantor);
        r_guarantor.setUserid(userid);

        int row_guarantor = 0;
        if (relativeid_guarantor != 0) {
            r_guarantor.setRelativeid(relativeid_guarantor);
            row_guarantor = relativeService.updateRelative(r_guarantor);

        } else {
            row_guarantor = relativeService.insertRelative(r_guarantor);
        }


        if (row_delivery > 0 && row_financial > 0 && row_guarantor > 0 && row_home > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }
    @RequestMapping(value = "/editdrelatives")
    public String EditRelatives(
            //
            int relativeid, String name,
            String relationship, String workplace,
            String nationality, String occupation,
            String mobile, String address,
            String email, String relativetype,
            int userid, Model model
    ){

        TRelative r = new TRelative();
        r.setName(name);
        r.setRelationship(relationship);
        r.setWorkplace(workplace);
        r.setNationality(nationality);
        r.setOccupation(occupation);
        r.setMobile(mobile);
        r.setAddress(address);
        r.setEmail(email);
        r.setRelativetype(relativetype);
        r.setUserid(userid);

        int row = 0;
        if (relativeid != 0) {
            r.setRelativeid(relativeid);
            row = relativeService.updateRelative(r);

        } else {
            row = relativeService.insertRelative(r);
        }
        if (row > 0 ) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }

    @RequestMapping(value = "/getContact")
    public String GetContact(  int userid, Model model_delivery,
                              Model model_home, Model model_financial, Model model_guarantor){

        TRelative r_financial = new TRelative();
        r_financial.setUserid(userid);
        r_financial.setRelativetype("financial");
        List<TRelative> list_financial = relativeService.getRelativesSelective(r_financial);
        model_financial.addAttribute("r_financial", list_financial.get(0));


        TRelative r_guarantor = new TRelative();
        r_guarantor.setUserid(userid);
        r_guarantor.setRelativetype("guarantor");
        List<TRelative> list_guarantor = relativeService.getRelativesSelective(r_guarantor);
        model_guarantor.addAttribute("r_guarantor", list_guarantor.get(0));

        TAddress r_delivery = new TAddress();
        r_delivery.setUserid(userid);
        r_delivery.setType("delivery");
        List<TAddress> list_delivery = addressService.getAddresssSelective(r_delivery);
        model_delivery.addAttribute("r_delivery", list_delivery.get(0));

        TAddress r_home = new TAddress();
        r_home.setUserid(userid);
        r_home.setType("delivery");
        List<TAddress> list_home = addressService.getAddresssSelective(r_home);
        model_delivery.addAttribute("r_home", list_home.get(0));

        return "index";
    }

    @RequestMapping(value = "/getRelatives")
    public String GetRelatives( String position, int userid, Model model){

        TRelative relative = new TRelative();
        relative.setUserid(userid);
        relative.setRelativetype(position);
        List<TRelative> list = relativeService.getRelativesSelective(relative);
        model.addAttribute("relativelist", list);
        return "index";
    }
    @RequestMapping(value = "/getRelative")
    public String GetRelativeByid(   int relaviveid, Model model){

        TRelative  relative= relativeService.selectRelativeById(relaviveid);
        model.addAttribute("relative", relative);
        return "index";
    }

    @RequestMapping(value = "/deleteRelative")
    public String DeleteRelative(   int relaviveid ){

        int  row= relativeService.deleteRelative(relaviveid);

        return "index";
    }
}
