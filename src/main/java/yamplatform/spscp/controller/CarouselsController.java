package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Carousels;
import yamplatform.spscp.service.CarouselsService;

@Controller
@RequestMapping("/Carousels")
@SessionAttributes({"user","manager_carousels","manager","Helpslist","Noticelist"})
public class CarouselsController {
    @Autowired
    CarouselsService carouselsService;
    //修改页面
    @RequestMapping("/Modeify")
    public String Modeify(Model model, @Param("id") Integer id ){
        Carousels carousels=carouselsService.SelectOne(id);
        model.addAttribute("manager_carousels",carousels);
        return "views/Managershtml/Modeify_carousels";
    }
    @RequestMapping("/Modeify_carsouels")
    public String Modeify_carsouels(Model model,@Param("url") String url){
        Carousels carousels=(Carousels) model.getAttribute("manager_carousels");
        if(url!=null&&!url.equals("")){
            carousels.setUrl(url);
        }
        carouselsService.UpdateCarousels(carousels);
        return "views/Managershtml/Manager_carousels";
    }
    //删除
    @RequestMapping("/delete")
    public String delete(Model model,@Param("id") Integer id){
        carouselsService.Delete(id);
        return "views/Managershtml/Manager_carousels";
    }
    //添加页面
    @RequestMapping("/add")
    public String add(Model model){
        return "views/Managershtml/add_carousels";
    }
    @RequestMapping("/add_carousels")
    public String add_carousels(Model model,@Param("url") String url){
        Carousels carousels=new Carousels();
        carousels.setUrl(url);
        carouselsService.InsertCarousels(carousels);
        return "views/Managershtml/Manager_carousels";
    }

}
