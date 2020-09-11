package yamplatform.spscp.controller;

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
@SessionAttributes({"user"})
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

}
