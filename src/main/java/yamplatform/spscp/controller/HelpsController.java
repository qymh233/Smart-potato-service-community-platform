package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Helps;
import yamplatform.spscp.service.HelpsService;

@Controller
@RequestMapping("/Helps")
@SessionAttributes({"user"})
public class HelpsController {
    @Autowired
    HelpsService helpsService;
//跳转帮助页面
    @RequestMapping("/Help_Landing_registration")
    public String Help_Landing_registration(@Param("title") String title, Model model){
        Helps helps=helpsService.SelectOne(title);
        model.addAttribute("helps",helps);
        return "views/Helpshtml/Help_Landing_registration";
    }
}
