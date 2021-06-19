package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Notices;
import yamplatform.spscp.service.NoticesService;

import java.util.List;

@Controller
@RequestMapping("/Notices")
@SessionAttributes({"user","manager","manager_notices","Noticelist"})
public class NoticesController {
    @Autowired
    NoticesService noticesService;
    //跳转公告页面
    @RequestMapping("/Notice_Privacy_copyright")
    public String Notice_Privacy_copyright(@Param("title") String title, Model model){
        Notices notice=noticesService.SelectOne(title);
        model.addAttribute("notice",notice);
        List<Notices> noticesList=noticesService.noticesList();
        model.addAttribute("Noticelist",noticesList);
        return "views/Noticeshtml/Notice_Privacy_copyright";
    }


    //修改页面
    @RequestMapping("/Modeify")
    public String Modeify(Model model,@Param("title") String title ){
        Notices notice=noticesService.SelectOne(title);
        model.addAttribute("manager_notices",notice);
        List<Notices> noticesList=noticesService.noticesList();
        model.addAttribute("Noticelist",noticesList);
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
        List<Notices> noticesList=noticesService.noticesList();
        model.addAttribute("Noticelist",noticesList);
        return "views/Managershtml/Manager_notices";
    }
    //删除
    @RequestMapping("/delete")
    public String delete(Model model,@Param("id") Integer id){
        noticesService.Delete(id);
        List<Notices> noticesList=noticesService.noticesList();
        model.addAttribute("Noticelist",noticesList);
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
        List<Notices> noticesList=noticesService.noticesList();
        model.addAttribute("Noticelist",noticesList);
        return "views/Managershtml/Manager_notices";
    }
}
