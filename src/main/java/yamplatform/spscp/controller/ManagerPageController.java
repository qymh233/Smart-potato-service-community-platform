package yamplatform.spscp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.LiveMsgs;
import yamplatform.spscp.service.LiveMsgsService;

import java.util.List;

@Controller
@RequestMapping("Manager")
@SessionAttributes({"manager"})
public class ManagerPageController {
    @Autowired
    LiveMsgsService liveMsgsService;
    //用户管理页面
    @RequestMapping("/Manager_users")
    public String Manager_users(Model model){
        return "views/Manager_HomePage";
    }
    //论坛管理页面
    @RequestMapping("/Manager_topics")
    public String Manager_topics(Model model){
        return "views/Managershtml/Manager_topics";
    }
    //专栏管理页面
    @RequestMapping("/Manager_knowledges")
    public String Manager_knowledges(Model model){
        return "views/Managershtml/Manager_categorys";
    }
    //图片库管理页面
    @RequestMapping("/Manager_photoLibrarys")
    public String Manager_photoLibrarys(Model model){
        return "views/Managershtml/Manager_photolibrarys";
    }
    //连接管理页面
    @RequestMapping("/Manager_relinks")
    public String Manager_relinks(Model model){
        return "views/Managershtml/Manager_links";
    }
    //连接管理页面
    @RequestMapping("/Manager_carousels")
    public String Manager_carousels(Model model){
        return "views/Managershtml/Manager_carousels";
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
    //留言查看
    @RequestMapping("/Manager_LiveMsgs")
    public String Manager_LiveMsgs(Model model){
        return "views/Managershtml/Manager_LiveMsgs";
    }
    //留言回复页面
    @RequestMapping("/Manager_LiveMsgsRecont")
    public String Manager_LiveMsgsRecont(Model model, Integer id){
        LiveMsgs liveMsgsR=liveMsgsService.SelectOne(id);
        model.addAttribute("liveMsgsR",liveMsgsR);
        System.out.println(liveMsgsR);
        return "views/Managershtml/Manager_LiveMsgsRecont";
    }
}
