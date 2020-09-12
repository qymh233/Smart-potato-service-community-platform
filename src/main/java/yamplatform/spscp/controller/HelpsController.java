package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Helps;
import yamplatform.spscp.service.HelpsService;

@Controller
@RequestMapping("/Helps")
@SessionAttributes({"user","manager","manager_helps"})
public class HelpsController {
    @Autowired
    HelpsService helpsService;
//跳转帮助页面
    @RequestMapping("/Help_Landing_registration")
    public String Help_Landing_registration(@Param("title") String title, Model model){
        Helps helps=helpsService.SelectOne(title);
        model.addAttribute("helps",helps);
        return "views/Helpshtml/Help_Landing_registration";
    }


    //修改页面
    @RequestMapping("/Modeify")
    public String Modeify(Model model,@Param("title") String title ){
        Helps helps=helpsService.SelectOne(title);
        model.addAttribute("manager_helps",helps);
        return "views/Managershtml/Modeify_help";
    }
    @RequestMapping("/Modeify_help")
    public String Modeify_help(Model model,@Param("title") String title,@Param("cont") String cont){
       Helps help=(Helps) model.getAttribute("manager_helps");
        if(title!=null&&!title.equals("")){
            help.setTitle(title);
        }
        if(cont!=null&&!cont.equals("")){
            help.setContent(cont);
        }
        helpsService.UpdateHelps(help);
        return "views/Managershtml/Manager_helps";
    }
    //删除
    @RequestMapping("/delete")
    public String delete(Model model,@Param("id") Integer id){
        helpsService.Delete(id);
        return "views/Managershtml/Manager_helps";
    }
    //添加页面
    @RequestMapping("/add")
    public String add(Model model){
        return "views/Managershtml/add_help";
    }
    @RequestMapping("/add_help")
    public String add_help(Model model,@Param("title") String title,@Param("cont") String cont){
        Helps help=new Helps();
        help.setTitle(title);
        help.setContent(cont);
        helpsService.InsertHelp(help);
        return "views/Managershtml/Manager_helps";
    }
}
