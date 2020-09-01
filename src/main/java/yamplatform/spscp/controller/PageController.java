package yamplatform.spscp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/i")
    public String i(){
        return "views/index";
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
    //注册
    @RequestMapping("/register")
    public String register(){
        return "views/register";
    }
}