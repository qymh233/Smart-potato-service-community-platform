package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Topics;
import yamplatform.spscp.pojo.Users;
import yamplatform.spscp.service.TopicsService;
import yamplatform.spscp.service.UsersService;

import java.util.List;
/*
* zcm
* 5
* */
@Controller
@RequestMapping("Users")
@SessionAttributes({"user"})
public class UsersController {
    @Autowired
    UsersService usersService;
    @Autowired
    TopicsService topicsService;
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
        List<Topics> topicsListxin=topicsService.TopicsListbyxin_ten();
        model.addAttribute("topicsListxin",topicsListxin);
        List<Topics> topicsListre=topicsService.TopicsListbyre_ten();
        model.addAttribute("topicsListre",topicsListre);
        List<Topics> topicsListjin=topicsService.TopicsListbyjin_ten();
        model.addAttribute("topicsListjin",topicsListjin);
        return "views/HomePage";
    }
    //注册
    @RequestMapping("/register")
    public String register(@Param("username")String username,@Param("nickname")String nickname,@Param("password")String password,@Param("email")String email){
        Users user=new Users();
        user.setUsername(username);
        user.setNickname(nickname);
        user.setPassword(password);
        user.setEmail(email);
        usersService.InsertUsers(user);
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
    //修改资料
    @RequestMapping("/self_Modify")
    public String self_Modify(Model model,@Param("nickname") String nickname,@Param("picturl")String picturl,@Param("sex") String sex,@Param("email") String email,@Param("profession") String profession,@Param("comefrom") String comefrom,@Param("introduction") String introduction){
        Users user=(Users)model.getAttribute("user");
        if(nickname!=null&&!nickname.equals("")){
            user.setNickname(nickname);
        }
        if(picturl!=null&&!picturl.equals("")){
            user.setPicture(picturl);
        }
        if(sex!=null&&!sex.equals("")){
            user.setSex(sex);
        }
        if(email!=null&&!email.equals("")){
            user.setEmail(email);
        }
        if(profession!=null&&!profession.equals("")){
            user.setProfession(profession);
        }
        if(comefrom!=null&&!comefrom.equals("")){
            user.setComefrom(comefrom);
        }
        if(introduction!=null&&!introduction.equals("")){
            user.setIntroduction(introduction);
        }
        usersService.UpdateUsers(user);
        return "views/Usershtml/Personal_Center";
    }
    //修改密码页面
    @RequestMapping("/Personal_password")
    public String Personal_password(Model model){
        return "views/Usershtml/Personal_password";
    }
    //修改密码
    @RequestMapping("/PW_Modify")
    public String PW_Modify(Model model,@Param("newpd") String newpd){
        Users user=(Users)model.getAttribute("user");
        user.setPassword(newpd);
        usersService.UpdateUsers(user);

        return "views/login";
    }

    //用户删除帖子Users
    @RequestMapping("/Users_delete")
    public String Users_delete(Model model,@Param("id") Integer id){
        usersService.DeleteUsers(id);
        return "views/Manager_HomePage";
    }
}
