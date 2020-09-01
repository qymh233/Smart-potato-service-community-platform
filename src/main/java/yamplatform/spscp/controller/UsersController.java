package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("Users")
@SessionAttributes({"user"})
public class UsersController {
    @RequestMapping("/login")
    public String login(@Param("username")String username,@Param("password")String password){
        System.out.println(username+" "+password);
        return "views/index";
    }
    @RequestMapping("/register")
    public String register(@Param("username")String username,@Param("nickname")String nickname,@Param("password")String password,@Param("email")String email){
        System.out.println(username+" "+nickname+" "+password+" "+email);
        return "views/login";
    }
}
