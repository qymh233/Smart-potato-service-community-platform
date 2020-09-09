package yamplatform.spscp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Rellinks;
import yamplatform.spscp.service.RellinksService;

import java.util.List;

@Controller
@RequestMapping("/Rellinks")
@SessionAttributes({"user"})
public class RellinksController {
    @Autowired
    RellinksService rellinksService;
    @RequestMapping("/Rellinks")
    public String Rellinks(Model model){
        List<Rellinks> rellinksList=rellinksService.RellinksList();
        model.addAttribute("rellinksList",rellinksList);
        return "views/Rellinkshtml/Rellinks";
    }
}
