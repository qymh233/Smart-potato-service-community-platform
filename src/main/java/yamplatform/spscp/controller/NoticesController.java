package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Notices;
import yamplatform.spscp.service.NoticesService;

@Controller
@RequestMapping("/Notices")
@SessionAttributes({"user","manager","manager_notices"})
public class NoticesController {
    @Autowired
    NoticesService noticesService;
    //跳转公告页面
    @RequestMapping("/Notice_Privacy_copyright")
    public String Notice_Privacy_copyright(@Param("title") String title, Model model){
        Notices notice=noticesService.SelectOne(title);
        model.addAttribute("notice",notice);
        return "views/Noticeshtml/Notice_Privacy_copyright";
    }


    //修改页面
    @RequestMapping("/Modeify")
    public String Modeify(Model model,@Param("title") String title ){
        Notices notice=noticesService.SelectOne(title);
        model.addAttribute("manager_notices",notice);
        return "views/Managershtml/Modeify_notice";
    }
    @RequestMapping("/Modeify_notice")
    public String Modeify_notice(Model model,@Param("title") String title,@Param("cont") String cont){
        Notices notice=(Notices) model.getAttribute("manager_notices");
        if(title!=null&&!title.equals("")){
            notice.setTitle(title);
        }
        if(cont!=null&&!cont.equals("")){
            notice.setAnnouncement(cont);
        }
        noticesService.UpdateNotice(notice);
        return "views/Managershtml/Manager_notices";
    }
    //删除
    @RequestMapping("/delete")
    public String delete(Model model,@Param("id") Integer id){
        noticesService.Delete(id);
        return "views/Managershtml/Manager_notices";
    }
    //添加页面
    @RequestMapping("/add")
    public String add(Model model){
        return "views/Managershtml/add_notice";
    }
    @RequestMapping("/add_notice")
    public String add_notice(Model model,@Param("title") String title,@Param("cont") String cont){
        Notices notice=new Notices();
        notice.setTitle(title);
        notice.setAnnouncement(cont);
        noticesService.InsertNotice(notice);
        return "views/Managershtml/Manager_notices";
    }
}
