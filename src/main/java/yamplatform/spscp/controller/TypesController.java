package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Types;
import yamplatform.spscp.service.TypesService;
import yamplatform.spscp.util.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Types")
@SessionAttributes({"user","manager","manager_types","categoryID","categoryName","Helpslist","Noticelist"})
public class TypesController {
    @Autowired
    TypesService typesService;
    @RequestMapping("type_see")
    public String type_see(Model model,@Param("id") Integer id){
        Types type=typesService.SelectOne(id);
        model.addAttribute("type",type);
        return "views/Categoryshtml/type_see";
    }
    //返回子栏目列表
    @RequestMapping("/typesList")
    @ResponseBody
    public Map<String,Object> typesList(Model model, Integer page, Integer limit){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        Integer cid=(Integer) model.getAttribute("categoryID");
        List<Types> typesList=typesService.Listpage(page,limit,cid);
        if(typesList == null) {
            return result;
        }
        int count=typesService.Count(cid);
        result.put("data",typesList);
        result.put("count",count);
        return result;
    }
    //修改页面
    @RequestMapping("/Modeify")
    public String Modeify(Model model, @Param("id") Integer id ){
        Types type=typesService.SelectOne(id);
        model.addAttribute("manager_types",type);
        return "views/Managershtml/Modeify_type";
    }
    @RequestMapping("/Modeify_type")
    public String Modeify_type(Model model,@Param("title") String title,@Param("cont") String cont,@Param("url") String url){
        Types type=(Types) model.getAttribute("manager_types");
        if(title!=null&&!title.equals("")){
            type.setName(title);
        }
        if(cont!=null&&!cont.equals("")){
            type.setContent(cont);
        }
        if(url!=null&&!url.equals("")){
            type.setUrl(url);
        }
        typesService.UpdateTypes(type);
        return "views/Managershtml/Manager_types";
    }
    //删除
    @RequestMapping("/delete")
    public String delete(Model model,@Param("id") Integer id){
        typesService.Delete(id);
        return "views/Managershtml/Manager_types";
    }
    //添加页面
    @RequestMapping("/add")
    public String add(Model model){
        return "views/Managershtml/add_type";
    }
    @RequestMapping("/add_type")
    public String add_type(Model model,@Param("title") String title,@Param("cont") String cont,@Param("url") String url){
        Types type=new Types();
        type.setName(title);
        type.setUrl(url);
        type.setContent(cont);
        Integer cid=(Integer) model.getAttribute("categoryID");
        type.setTypescategoryid(cid);
        typesService.InsertTypes(type);
        return "views/Managershtml/Manager_types";
    }
    //返回上一页
    @RequestMapping("/returnpage")
    public String returnpage(Model model){
        return "views/Managershtml/Manager_types";
    }
}
