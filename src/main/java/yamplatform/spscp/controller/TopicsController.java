package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import yamplatform.spscp.pojo.Topics;
import yamplatform.spscp.pojo.Users;
import yamplatform.spscp.service.TopicsService;
import yamplatform.spscp.util.Pages;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Topics")
@SessionAttributes({"user"})
public class TopicsController {
    @Autowired
    TopicsService topicsService;
    String mypagestat="";
    String myquestion="";
    @RequestMapping("/Topics")
    public String Topics(Model model, @Param("page")String page){
        if(page.equals("xin")){
            mypagestat="xin";
            model.addAttribute("stat","xin");
        }else if(page.equals("jin")){
            mypagestat="jin";
            model.addAttribute("stat","jin");
        }else if(page.equals("re")){
            mypagestat="re";
            model.addAttribute("stat","re");
        }else {
            mypagestat="lun";
            model.addAttribute("stat","lun");
        }
        return "views/Topicshtml/Topics";
    }

    @RequestMapping("/mytopicsList")
    @ResponseBody
    public Map<String,Object> mytopicsList(Model model,Integer page, Integer limit){
        List<Topics> topicsListSub;
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<Topics> topicsList;
        if(mypagestat.equals("xin")){
            topicsList=topicsService.TopicsListbyxin();
        }else if(mypagestat.equals("jin")){
           topicsList=topicsService.TopicsListbyjin();
        }else if(mypagestat.equals("re")){
            topicsList=topicsService.TopicsListbyre();
        }else {
            topicsList=topicsService.TopicsList();
        }
        if(topicsList == null) {
            return result;
        }
        Pages pages=new Pages();
        topicsListSub = (List<Topics>) pages.listSub(topicsList, page, limit);
        result.put("data",topicsListSub);
        result.put("count",topicsList.size());
        return result;
    }

    @RequestMapping("/Topic_up")
    public String Topic_up(){
        return "views/Topicshtml/Topics_up";
    }

    @RequestMapping(value = "/uploadimg" , method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> upload(HttpServletRequest servletRequest,
                                      @RequestParam("file") MultipartFile file
    ) throws IOException {

        //如果文件内容不为空，则写入上传路径
        if (!file.isEmpty()) {
            //上传文件路径
            String path = "E:\\ideaproject\\spscp\\src\\main\\resources\\static\\img\\Topics\\" ;
            //上传文件名
            String filename = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" +file.getOriginalFilename();
            File filepath = new File(path, filename);
            //判断路径是否存在，没有就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目标文档中
            File file1 = new File(path + File.separator + filename);
            file.transferTo(file1);
            Map<String, Object> res = new HashMap<>();
            String dburl="http://localhost:8080/img/Topics/"+filename;
            //返回的是一个url对象
            res.put("url", dburl);
            res.put("msg","ok");
            res.put("code",0);
            return res;

        } else {
            Map<String, Object> res = new HashMap<>();
            //返回的是一个url对象
            res.put("url", null);
            res.put("msg","no");
            res.put("code",100);
            return res;
        }
    }
    @RequestMapping("/topic_add")
    public String topic_add(Model model,@Param("title") String title,@Param("content")String cont,@Param("picturl")String picturl){
        Users user=(Users) model.getAttribute("user");
        Topics topic=new Topics();
        topic.setTitle(title);
        topic.setContent(cont);
        if(picturl!=null){
            topic.setPicturl(picturl);
        }
        topic.setUid(user.getId());
        topicsService.InsertTopics(topic);
        List<Topics> topicsList=topicsService.TopicsListbyxin();
        model.addAttribute("topicsList",topicsList);
        model.addAttribute("stat","xin");
        return "views/Topicshtml/Topics";
    }

    @RequestMapping("/Topic_see")
    public String Topic_see(Model model,@Param("id") Integer id){
        Topics topic=topicsService.SelectOne(id);
        model.addAttribute("topic",topic);
        return "views/Topicshtml/Topics_see";
    }

    @RequestMapping("/Topic_nice")
    public String Topic_nice(Model model,@Param("id") Integer id){
        Topics oldtopic=topicsService.SelectOne(id);
        int newnice=oldtopic.getCountnice()+1;
        oldtopic.setCountnice(newnice);
        topicsService.UpdateTopics(oldtopic);
        Topics topic=topicsService.SelectOne(id);
        model.addAttribute("topic",topic);
        return "views/Topicshtml/Topics_see";
    }

   /* @RequestMapping("/findSignIn")
    public String findSignIn(Model model,@Param("question")String question){
        List<Topics> topicsList=topicsService.searchTopicsList(question);
        if(topicsList!=null){
            model.addAttribute("topicsList",topicsList);
            model.addAttribute("stat","ok");
        }else {
            model.addAttribute("stat","no");
        }
        model.addAttribute("question",question);
        return "views/Topicshtml/findSignIn";
    }*/
   @RequestMapping("/findSignIn")
   public String findSignIn(Model model,@Param("question")String question){
       myquestion=question;
       model.addAttribute("question",question);
       return "views/Topicshtml/findSignIn";
   }
    @RequestMapping("/findSignInlist")
    @ResponseBody
    public Map<String,Object> findSignInlist(Model model,Integer page, Integer limit){
        List<Topics> topicsListSub;
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<Topics> topicsList=topicsService.searchTopicsList(myquestion);
        if(topicsList == null) {
            return result;
        }
        Pages pages=new Pages();
        topicsListSub = (List<Topics>) pages.listSub(topicsList, page, limit);
        result.put("data",topicsListSub);
        result.put("count",topicsList.size());
        return result;
    }

    @RequestMapping("/Personal_topic")
    public String Personal_topic(Model model){
        return "views/Usershtml/Personal_topic";
    }

    @RequestMapping("/per_topicsList")
    @ResponseBody
    public Map<String,Object> per_topicsList(Model model,Integer page, Integer limit){
        List<Topics> topicsListSub;
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        Users user=(Users) model.getAttribute("user");
        List<Topics> topicsList=topicsService.TopicsListbyuid(user.getId());
        if(topicsList == null) {
            return result;
        }
        Pages pages=new Pages();
        topicsListSub = (List<Topics>) pages.listSub(topicsList, page, limit);
        result.put("data",topicsListSub);
        result.put("count",topicsList.size());
        return result;
    }
    @RequestMapping("/Personal_Topic_see")
    public String Personal_Topic_see(Model model,@Param("id") Integer id){
        Topics topic=topicsService.SelectOne(id);
        model.addAttribute("topic",topic);
        return "views/Usershtml/Personal_Topics_see";
    }
    @RequestMapping("/Topic_delete")
    public String Topic_delete(Model model,@Param("id") Integer id){
        topicsService.DeleteTopics(id);
        return "views/Usershtml/Personal_topic";
    }

}
