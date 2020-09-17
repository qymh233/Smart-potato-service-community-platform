package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Categorys;
import yamplatform.spscp.service.CategorysService;

import java.util.List;

@Controller
@RequestMapping("/Categorys")
@SessionAttributes({"user","manager","manager_categorys","categoryID","categoryName"})
public class CategorysController {
    @Autowired
    CategorysService categorysService;
    //跳转知识专栏
    @RequestMapping("/Knowledge_column")
    public String Knowledge_column(Model model){
        List<Categorys> categorysList=categorysService.CategorysList();
        model.addAttribute("categorysList",categorysList);
        return "views/Categoryshtml/Knowledge_column";
    }

    //修改页面
    @RequestMapping("/Modeify")
    public String Modeify(Model model,@Param("id") Integer id ){
        Categorys category=categorysService.SelectOne(id);
        model.addAttribute("manager_categorys",category);
        return "views/Managershtml/Modeify_categorys";
    }
    @RequestMapping("/Modeify_category")
    public String Modeify_category(Model model,@Param("title") String title){
        Categorys category=(Categorys) model.getAttribute("manager_categorys");
        if(title!=null&&!title.equals("")){
            category.setName(title);
        }
        categorysService.UpdateCategorys(category);
        return "views/Managershtml/Manager_categorys";
    }
    //删除
    @RequestMapping("/delete")
    public String delete(Model model,@Param("id") Integer id){
        categorysService.Delete(id);
        return "views/Managershtml/Manager_categorys";
    }
    //添加页面
    @RequestMapping("/add")
    public String add(Model model){
        return "views/Managershtml/add_categorys";
    }
    @RequestMapping("/add_category")
    public String add_category(Model model,@Param("title") String title){
        Categorys category=new Categorys();
        category.setName(title);
        categorysService.InsertCategorys(category);
        return "views/Managershtml/Manager_categorys";
    }

    //查看
    @RequestMapping("/find")
    public String find(Model model,@Param("id") Integer id){
        model.addAttribute("categoryID",id);
        Categorys category=categorysService.SelectOne(id);
        model.addAttribute("categoryName",category.getName());
        return "views/Managershtml/Manager_types";
    }

}
