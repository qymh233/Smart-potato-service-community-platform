package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Users;
import yamplatform.spscp.service.UsersService;

@Controller
@RequestMapping("Users")
@SessionAttributes({"user"})
public class UsersController {
    @Autowired
    UsersService usersService;
    //登陆
    @RequestMapping("/login")
    public String login(@Param("username")String username, @Param("password")String password, Model model){
        System.out.println(username+" "+password);
        Users user=usersService.SelectOne(username,password);
        if(user==null){
            return "views/login";
        }
        model.addAttribute("user",user);
        //帖子查询
        return "views/HomePage";
    }
    //TODO
    //具体逻辑没写
    //注册
    @RequestMapping("/register")
    public String register(@Param("username")String username,@Param("nickname")String nickname,@Param("password")String password,@Param("email")String email){
        System.out.println(username+" "+nickname+" "+password+" "+email);
        return "views/login";
    }
    //个人中心
    @RequestMapping("/Personal_Center")
    public String Personal_Center(){
        return "views/Usershtml/Personal_Center";
    }

    //修改资料页面
    @RequestMapping("/Personal_Modify")
    public String Personal_Modify(Model model){
        return "views/Usershtml/Personal_Modify";
    }
    //TODO
    //具体逻辑没写
    //修改资料
    @RequestMapping("/self_Modify")
    public String self_Modify(Model model,@Param("nickname") String nickname,@Param("sex") String sex,@Param("email") String email,@Param("profession") String profession,@Param("comefrom") String comefrom,@Param("introduction") String introduction){
        System.out.println(nickname+" "+sex+" "+email+" "+profession+" "+comefrom+" "+introduction);
        return "views/Usershtml/Personal_Center";
    }
    //修改资料页面
    @RequestMapping("/Personal_password")
    public String Personal_password(Model model){
        /*Users users=(Users) model.getAttribute("user");
        model.addAttribute("user",users);*/
        return "views/Usershtml/Personal_password";
    }
    //TODO
    //具体逻辑没写
    //修改密码
    @RequestMapping("/PW_Modify")
    public String PW_Modify(Model model,@Param("password") String password,@Param("newpd") String newpd){
        System.out.println(password+" "+newpd);
        return "views/login";
    }
}
