package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Collects;
import yamplatform.spscp.pojo.News;
import yamplatform.spscp.pojo.Users;
import yamplatform.spscp.service.NewsService;
import yamplatform.spscp.util.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/News")
@SessionAttributes({"user"})
public class NewsController {
    @Autowired
    NewsService newsService;
    //跳转消息页面
    @RequestMapping("/Personal_news")
    public String Personal_news(Model model){
        return  "views/Usershtml/Personal_news";
    }
    //返回列表
    @RequestMapping("/newsList")
    @ResponseBody
    public Map<String,Object> newsList(Model model, Integer page, Integer limit){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        Users user=(Users) model.getAttribute("user");
        List<News> newsList=newsService.Listpage(page,limit,user.getId());
        if(newsList == null) {
            return result;
        }
        int count=newsService.Count(user.getId());
        result.put("data",newsList);
        result.put("count",count);
        return result;
    }
}
