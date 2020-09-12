package yamplatform.spscp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("Manager")
@SessionAttributes({"manager"})
public class ManagerPageController {
    //用户管理页面
    @RequestMapping("/Manager_users")
    public String Manager_users(Model model){
        return "views/Manager_HomePage";
    }
    //论坛管理页面
    @RequestMapping("/Manager_topics")
    public String Manager_topics(Model model){
        return "";
    }
    //专栏管理页面
    @RequestMapping("/Manager_knowledges")
    public String Manager_knowledges(Model model){
        return "";
    }
    //图片库管理页面
    @RequestMapping("/Manager_photoLibrarys")
    public String Manager_photoLibrarys(Model model){
        return "";
    }
    //连接管理页面
    @RequestMapping("/Manager_relinks")
    public String Manager_relinks(Model model){
        return "views/Managershtml/Manager_links";
    }
    //帮助管理页面
    @RequestMapping("/Manager_helps")
    public String Manager_helps(Model model){
        return "views/Managershtml/Manager_helps";
    }
    //公告管理页面
    @RequestMapping("/Manager_notices")
    public String Manager_notices(Model model){
        return "views/Managershtml/Manager_notices";
    }
}
