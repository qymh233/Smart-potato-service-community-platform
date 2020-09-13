package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Collects;
import yamplatform.spscp.pojo.Users;
import yamplatform.spscp.service.CollectsService;
import yamplatform.spscp.util.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Collects")
@SessionAttributes({"user"})
public class CollectsController {
    @Autowired
    CollectsService collectsService;
    //跳转收藏页面
    @RequestMapping("/Personal_collect")
    public String Personal_collect(Model model){
        return  "views/Usershtml/Personal_collect";
    }
    //返回列表
    @RequestMapping("/collectsList")
    @ResponseBody
    public Map<String,Object> collectsList(Model model, Integer page, Integer limit){
        List<Collects> collectsListSub;
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        Users user=(Users) model.getAttribute("user");
        List<Collects> collectsList=collectsService.CollectsList(user.getId());
        if(collectsList == null) {
            return result;
        }
        Pages pages=new Pages();
        collectsListSub = (List<Collects>) pages.listSub(collectsList, page, limit);
        result.put("data",collectsListSub);
        result.put("count",collectsList.size());
        return result;
    }
    //删除
    @RequestMapping("/delete")
    public String delete(Model model,@Param("id") Integer id){
        collectsService.Delete(id);
        return  "views/Usershtml/Personal_collect";
    }
}
