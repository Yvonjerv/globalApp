package controller;

import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.DepartmentService;
import service.MajorService;
import service.ProgramService;
import service.UniversityService;

import java.util.List;

@Controller
@RequestMapping(value = "/university")
public class UniversityController {

    @Autowired
    private UniversityService universityService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private ProgramService programService;
    @Autowired
    private MajorService majorService;

    @RequestMapping(value = "/edituniversity")
    public String editUniversity(int universityid, String universityname, int locationid, String universitydesc, String weburl, String universitykey, Model model) {
        TUniversity university = new TUniversity();
        university.setUniversityname(universityname);
        university.setLocationid(locationid);
        university.setUniversitydesc(universitydesc);
        university.setWeburl(weburl);
        university.setUniversityKey(universitykey);

        int row;
        if (universityid != 0) {
            university.setUniversityid(universityid);
            row = universityService.updateUniversity(university);
        } else {
            row = universityService.insertUniversity(university);
        }

        if (row > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }


    @RequestMapping(value = "/deleteuniversity")
    public String deleteUniversity(int universityid, Model model) {
        int row = universityService.deleteUniversity(universityid);

        if (row > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }


    @RequestMapping(value = "/getuniversity")
    public String getUniversity(String universityKey, Model model) {

        TUniversity university = new TUniversity();
//        if (universityKey!=null && universityKey.equals("")){
        university.setUniversityKey(universityKey);
//        }else{
//
//            university.setUniversityKey(sessionuniversity.universityKey);
//        }


        List<TUniversity> list = universityService.getUniversitiesSelective(university);
        model.addAttribute("university", list.get(0));

        return "management/universityhome";
    }
    @RequestMapping(value = "/getuniversities")
    public String getUniversities(String universityname, String position, Model model) {

        TUniversity university = new TUniversity();
        university.setUniversityKey(position);
        university.setUniversityname(universityname);

        List<TUniversity> list = universityService.getUniversitiesSelective(university);
        model.addAttribute("unilist", list);

        return "management/universityhome";
    }

    @RequestMapping(value = "/editdepartment")
    public String editDepartment(int departmentid, String departmentname, String departmentdesc, int universityid, Model model) {
        TDepartment department = new TDepartment();
        department.setDepartmentname(departmentname);
        department.setDepartmentdesc(departmentdesc);
        department.setUniversityid(universityid);

        int row;
        if (departmentid != 0) {

            department.setDepartmentid(departmentid);
            row = departmentService.updateDepartment(department);
        } else {
            row = departmentService.insertDepartment(department);
        }
        if (row > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }


    @RequestMapping(value = "/deletedepartment")
    public String deleteDepartment(int departmentid, Model model) {
        int row = departmentService.deleteDepartment(departmentid);

        if (row > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }

    @RequestMapping(value = "/getdepartmentsbyuni")
    public String getDepartmentsByUni(int universityid, Model model_dept, Model model_uni) {

        TDepartment department = new TDepartment();

        department.setUniversityid(universityid);
        TUniversity university = new TUniversity();
        university.setUniversityid(universityid);

        List<TDepartment> list_dept = departmentService.getDepartmentsSelective(department);
        List<TUniversity> list_uni = universityService.getUniversitiesSelective(university);

        model_dept.addAttribute("list_un", list_uni);
        model_uni.addAttribute("list_dept", list_dept.get(0));

        return "index";
    }

    @RequestMapping(value = "/getdepartment")
    public String getDepartment(int departmentid, Model model) {
        TDepartment dept = departmentService.selectDepartmentById(departmentid);
        model.addAttribute("dept", dept);
        return "index";
    }

    @RequestMapping(value = "/editmajor")
    public String editMajor(int majorid,
                            String majorname,
                            String researcharea,
                            String majordesc,
                            int departmentid, Model model) {


        TMajor major = new TMajor();
        major.setDepartmentid(departmentid);
        major.setMajorname(majorname);
        major.setMajordesc(majordesc);
        major.setResearcharea(researcharea);

        int row;
        if (majorid > 0) {
            major.setMajorid(majorid);
            row = majorService.updateMajor(major);
        } else {
            row = majorService.insertMajor(major);
        }

        if (row > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }

    }

    @RequestMapping(value = "/editprogram")
    public String editProgram(int programid, int degreeid, int majorid, int duration, int langId, String status, String startdate, String enddate, String notes, Model model) {
        TProgram program = new TProgram();
        program.setDegreeid(degreeid);
        program.setMajorid(majorid);
        program.setDuration(duration);
        program.setLangid(langId);
        program.setStatus(status);
        program.setStartdate(startdate);
        program.setEnddate(enddate);
        program.setNotes(notes);

        int row;
        if (programid != 0) {
            program.setProgramid(programid);
            row = programService.updateProgram(program);
        } else {
            row = programService.insertProgram(program);
        }
        if (row > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }


    @RequestMapping(value = "/deleteprogram")
    public String deleteProgram(int programid, Model model) {
        int row = programService.deleteProgram(programid);

        if (row > 0) {
            return "index";
        } else {
            model.addAttribute("errMsg", "Failed. Something went wrong!");
            model.addAttribute("backUrl", "../views/login.jsp");
            return "errors";
        }
    }


    @RequestMapping(value = "/getprogram")
    public String getProgram(int programid, Model model_prog) {

        TProgram program = programService.selectProgramById(programid);
        model_prog.addAttribute("prog", program);

        return "index";
    }

}
