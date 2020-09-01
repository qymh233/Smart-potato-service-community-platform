package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yamplatform.spscp.pojo.Notices;
import yamplatform.spscp.service.NoticesService;

@Controller
@RequestMapping("/Notice")
public class NoticesController {
    @Autowired
    NoticesService noticesService;
    @RequestMapping("/i")
    public String i(){
        return "views/index";
    }
    @RequestMapping("/Notice_Privacy_copyright")
    public String Notice_Privacy_copyright(@Param("title") String title, Model model){
        Notices notice=noticesService.SelectOne(title);
        model.addAttribute("notice",notice);
        return "views/Noticehtml/Notice_Privacy_copyright";
    }
}
