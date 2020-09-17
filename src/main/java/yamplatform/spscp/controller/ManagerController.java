package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.*;
import yamplatform.spscp.service.*;
import yamplatform.spscp.util.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Manager")
@SessionAttributes({"manager","manager_user"})
public class ManagerController {
    @Autowired
    ManagersService managersService;
    @Autowired
    UsersService usersService;
    @Autowired
    RellinksService rellinksService;
    @Autowired
    HelpsService helpsService;
    @Autowired
    NoticesService noticesService;
    @Autowired
    CategorysService categorysService;
    @Autowired
    PhotoLibrarysService photoLibrarysService;
    @Autowired
    TopicsService topicsService;
    //登陆
    @RequestMapping("/login")
    public String login(@Param("username")String username, @Param("password")String password, Model model){
        Managers manager=managersService.SelectOne(username,password);
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
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<Users> usersList=usersService.usersList(page,limit);
        if(usersList == null) {
            return result;
        }
        int t=usersService.Count();
        result.put("data",usersList);
        result.put("count",t);
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
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<Rellinks> rellinksList=rellinksService.Listpage(page,limit);
        if(rellinksList == null) {
            return result;
        }
        int count=rellinksService.Count();
        result.put("data",rellinksList);
        result.put("count",count);
        return result;
    }

    //返回帮助列表
    @RequestMapping("/helpsList")
    @ResponseBody
    public Map<String,Object> helpsList(Model model, Integer page, Integer limit){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<Helps> helpsList=helpsService.Listpage(page,limit);
        if(helpsList == null) {
            return result;
        }
        int count=helpsService.Count();
        result.put("data",helpsList);
        result.put("count",count);
        return result;
    }

    //返回公告列表
    @RequestMapping("/noticesList")
    @ResponseBody
    public Map<String,Object> noticesList(Model model, Integer page, Integer limit){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<Notices> noticesList=noticesService.Listpage(page,limit);
        if(noticesList == null) {
            return result;
        }
        int count=noticesService.Count();
        result.put("data",noticesList);
        result.put("count",count);
        return result;
    }

    //返回栏目列表
    @RequestMapping("/categorysList")
    @ResponseBody
    public Map<String,Object> categorysList(Model model, Integer page, Integer limit){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<Categorys> categorysList=categorysService.Listpage(page,limit);
        if(categorysList == null) {
            return result;
        }
        int count=categorysService.Count();
        result.put("data",categorysList);
        result.put("count",count);
        return result;
    }

    //返回图片库列表
    @RequestMapping("/photolibrarysList")
    @ResponseBody
    public Map<String,Object> photolibrarysList(Model model, Integer page, Integer limit){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<PhotoLibrarys> photoLibrarysList=photoLibrarysService.Listpage(page,limit);
        if(photoLibrarysList == null) {
            return result;
        }
        int count=photoLibrarysService.Count();
        result.put("data",photoLibrarysList);
        result.put("count",count);
        return result;
    }

    //返回论坛列表
    @RequestMapping("/topicsList")
    @ResponseBody
    public Map<String,Object> topicsList(Model model, Integer page, Integer limit){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<Topics> topicsList=topicsService.Listpage(page,limit);
        if(topicsList == null) {
            return result;
        }
        int count=topicsService.Count();
        result.put("data",topicsList);
        result.put("count",count);
        return result;
    }
}
