package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Helps;
import yamplatform.spscp.pojo.Notices;
import yamplatform.spscp.pojo.Rellinks;
import yamplatform.spscp.pojo.Users;
import yamplatform.spscp.service.HelpsService;
import yamplatform.spscp.service.NoticesService;
import yamplatform.spscp.service.RellinksService;
import yamplatform.spscp.service.UsersService;
import yamplatform.spscp.util.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Manager")
@SessionAttributes({"manager","manager_user"})
public class ManagerController {
    @Autowired
    UsersService usersService;
    @Autowired
    RellinksService rellinksService;
    @Autowired
    HelpsService helpsService;
    @Autowired
    NoticesService noticesService;
    //登陆
    //todo
    //创建管理员表
    @RequestMapping("/login")
    public String login(@Param("username")String username, @Param("password")String password, Model model){
        Users manager=usersService.SelectOne(username,password);
        if(manager==null){
            return "views/managerlogin";
        }
        model.addAttribute("manager",manager);
        return "views/Manager_HomePage";
    }
    //返回用户列表
    @RequestMapping("/usersList")
    @ResponseBody
    public Map<String,Object> usersList(Model model, Integer page, Integer limit){
        List<Users> usersListSub;
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<Users> usersList=usersService.usersList();
        if(usersList == null) {
            return result;
        }
        Pages pages=new Pages();
        usersListSub = (List<Users>) pages.listSub(usersList, page, limit);
        result.put("data",usersListSub);
        result.put("count",usersList.size());
        return result;
    }
    //跳转修改用户信息页面
    @RequestMapping("/ModeifyUser")
    public String ModeifyUser(Model model,@Param("id") Integer id){
        Users user=usersService.SelectOnebyid(id);
        model.addAttribute("manager_user",user);
        return "views/Managershtml/ModeifyUser";
    }
    //修改用户资料
    @RequestMapping("/self_Modify")
    public String self_Modify(Model model,@Param("password") String password,@Param("nickname") String nickname,@Param("sex") String sex,@Param("email") String email,@Param("profession") String profession,@Param("comefrom") String comefrom,@Param("introduction") String introduction){
        Users user=(Users)model.getAttribute("manager_user");
        if(nickname!=null&&!nickname.equals("")){
            user.setNickname(nickname);
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
        if(password!=null&&!password.equals("")){
            user.setPassword(password);
        }
        usersService.UpdateUsers(user);
        return "views/Manager_HomePage";
    }

    //返回连接列表
    @RequestMapping("/linksList")
    @ResponseBody
    public Map<String,Object> linksList(Model model, Integer page, Integer limit){
        List<Rellinks> linksListSub;
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<Rellinks> rellinksList=rellinksService.RellinksList();
        if(rellinksList == null) {
            return result;
        }
        Pages pages=new Pages();
        linksListSub = (List<Rellinks>) pages.listSub(rellinksList, page, limit);
        result.put("data",linksListSub);
        result.put("count",rellinksList.size());
        return result;
    }

    //返回帮助列表
    @RequestMapping("/helpsList")
    @ResponseBody
    public Map<String,Object> helpsList(Model model, Integer page, Integer limit){
        List<Helps> helpsListSub;
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<Helps> helpsList=helpsService.helpsList();
        if(helpsList == null) {
            return result;
        }
        Pages pages=new Pages();
        helpsListSub = (List<Helps>) pages.listSub(helpsList, page, limit);
        result.put("data",helpsListSub);
        result.put("count",helpsList.size());
        return result;
    }

    //返回公告列表
    @RequestMapping("/noticesList")
    @ResponseBody
    public Map<String,Object> noticesList(Model model, Integer page, Integer limit){
        List<Notices> noticesListSub;
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<Notices> noticesList=noticesService.noticesList();
        if(noticesList == null) {
            return result;
        }
        Pages pages=new Pages();
        noticesListSub = (List<Notices>) pages.listSub(noticesList, page, limit);
        result.put("data",noticesListSub);
        result.put("count",noticesList.size());
        return result;
    }
}
