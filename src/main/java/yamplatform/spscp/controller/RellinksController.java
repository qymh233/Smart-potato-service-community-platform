package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Rellinks;
import yamplatform.spscp.service.RellinksService;

import java.util.List;

@Controller
@RequestMapping("/Rellinks")
@SessionAttributes({"user","manager_links","manager"})
public class RellinksController {
    @Autowired
    RellinksService rellinksService;
    //友情连接
    @RequestMapping("/Rellinks")
    public String Rellinks(Model model){
        List<Rellinks> rellinksList=rellinksService.RellinksList();
        model.addAttribute("rellinksList",rellinksList);
        return "views/Rellinkshtml/Rellinks";
    }
    //修改页面
    @RequestMapping("/Modeify")
    public String Modeify(Model model,@Param("id") Integer id ){
        Rellinks rellink=rellinksService.SelectOne(id);
        model.addAttribute("manager_links",rellink);
        return "views/Managershtml/Modeify_link";
    }
    @RequestMapping("/Modeify_link")
    public String Modeify_link(Model model,@Param("title") String title,@Param("url") String url){
        Rellinks rellink=(Rellinks) model.getAttribute("manager_links");
        if(title!=null&&!title.equals("")){
            rellink.setTitle(title);
        }
        if(url!=null&&!url.equals("")){
            rellink.setUrl(url);
        }
        rellinksService.UpdateRellinks(rellink);
        return "views/Managershtml/Manager_links";
    }
    //删除
    @RequestMapping("/delete")
    public String delete(Model model,@Param("id") Integer id){
        rellinksService.Delete(id);
        return "views/Managershtml/Manager_links";
    }
    //添加页面
    @RequestMapping("/add")
    public String add(Model model){
        return "views/Managershtml/add_link";
    }
    @RequestMapping("/add_link")
    public String add_link(Model model,@Param("title") String title,@Param("url") String url){
        Rellinks rellink=new Rellinks();
        rellink.setTitle(title);
        rellink.setUrl(url);
        rellinksService.InsertRellinks(rellink);
        return "views/Managershtml/Manager_links";
    }
}
