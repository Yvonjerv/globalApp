package controller;

import model.VProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.VProgramService;

import java.util.List;

@Controller
@RequestMapping(value = "/program")
public class VProgramController {
    @Autowired
    private VProgramService programService;

    @RequestMapping(value = "/getprograms") //
    public String getPrograms(Model model) {
      List<VProgram> list= programService.getPrograms();
        model.addAttribute("programs",list);
        return "search";
    }
}