package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Notices;
import yamplatform.spscp.service.NoticesService;

@Controller
@RequestMapping("/Notices")
@SessionAttributes({"user"})
public class NoticesController {
    @Autowired
    NoticesService noticesService;
    //跳转公告页面
    @RequestMapping("/Notice_Privacy_copyright")
    public String Notice_Privacy_copyright(@Param("title") String title, Model model){
        Notices notice=noticesService.SelectOne(title);
        model.addAttribute("notice",notice);
        return "views/Noticeshtml/Notice_Privacy_copyright";
    }
}
