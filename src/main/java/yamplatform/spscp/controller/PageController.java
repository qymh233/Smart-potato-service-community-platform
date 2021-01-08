package yamplatform.spscp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Carousels;
import yamplatform.spscp.pojo.Helps;
import yamplatform.spscp.pojo.Notices;
import yamplatform.spscp.pojo.Topics;
import yamplatform.spscp.service.CarouselsService;
import yamplatform.spscp.service.HelpsService;
import yamplatform.spscp.service.NoticesService;
import yamplatform.spscp.service.TopicsService;

import java.util.List;

@Controller
@SessionAttributes({"user","Helpslist","Noticelist"})
public class PageController {
    @Autowired
    TopicsService topicsService;
    @Autowired
    HelpsService helpsService;
    @Autowired
    NoticesService noticesService;
    @Autowired
    CarouselsService carouselsService;
    @RequestMapping("/i")
    public String i(){
        return "views/index";
    }
    @RequestMapping("/qiniu")
    public String qiniu(){
        return "views/PhotoLibraryshtml/qiniu";
    }
    //首页面
    @RequestMapping("/")
    public String index(){
        return "views/SystemMainPage";
    }
    //登陆
    @RequestMapping("/login")
    public String login(){
        return "views/login";
    }
    //登陆
    @RequestMapping("/managerlogin")
    public String managerlogin(){
        return "views/managerlogin";
    }
    //注册
    @RequestMapping("/register")
    public String register(){
        return "views/register";
    }
    //首页
    @RequestMapping("/home")
    public String home(Model model){
        //轮播图集合
        List<Carousels> carouselsList=carouselsService.CarouselsList();
        model.addAttribute("carouselsList",carouselsList);
        //帖子集合
        List<Topics> topicsListxin=topicsService.TopicsListbyxin_ten();
        model.addAttribute("topicsListxin",topicsListxin);
        List<Topics> topicsListre=topicsService.TopicsListbyre_ten();
        model.addAttribute("topicsListre",topicsListre);
        List<Topics> topicsListjin=topicsService.TopicsListbyjin_ten();
        model.addAttribute("topicsListjin",topicsListjin);
        //帮助集合
        List<Helps> helpsList=helpsService.helpsList();
        model.addAttribute("Helpslist",helpsList);
        //公告集合
        List<Notices> noticesList=noticesService.noticesList();
        model.addAttribute("Noticelist",noticesList);
        return "views/HomePage";
    }
}
