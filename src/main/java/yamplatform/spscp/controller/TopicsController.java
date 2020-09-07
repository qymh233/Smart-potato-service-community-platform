package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import yamplatform.spscp.pojo.Topics;
import yamplatform.spscp.service.TopicsService;

import java.util.List;

@Controller
@RequestMapping("/Topics")
@SessionAttributes({"user"})
public class TopicsController {
    @Autowired
    TopicsService topicsService;
    @RequestMapping("/Topics")
    public String Topics(Model model, @Param("page")String page){
        if(page.equals("xin")){
            List<Topics> topicsList=topicsService.TopicsListbyxin();
            model.addAttribute("topicsList",topicsList);
            model.addAttribute("stat","xin");
        }else if(page.equals("jin")){
            List<Topics> topicsList=topicsService.TopicsListbyjin();
            model.addAttribute("topicsList",topicsList);
            model.addAttribute("stat","jin");
        }else if(page.equals("re")){
            List<Topics> topicsList=topicsService.TopicsListbyre();
            model.addAttribute("topicsList",topicsList);
            model.addAttribute("stat","re");
        }else {
            List<Topics> topicsList=topicsService.TopicsList();
            model.addAttribute("topicsList",topicsList);
            model.addAttribute("stat","lun");
        }
        return "views/Topicshtml/Topics";
    }
}
