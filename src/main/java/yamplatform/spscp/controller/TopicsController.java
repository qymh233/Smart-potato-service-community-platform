package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import yamplatform.spscp.pojo.Collects;
import yamplatform.spscp.pojo.Helps;
import yamplatform.spscp.pojo.Topics;
import yamplatform.spscp.pojo.Users;
import yamplatform.spscp.service.CollectsService;
import yamplatform.spscp.service.NewsService;
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
@SessionAttributes({"user","manager","mypagestat","myquestion"})
public class TopicsController {
    @Autowired
    TopicsService topicsService;
    @Autowired
    CollectsService collectsService;
    @Autowired
    NewsService newsService;
   // String myquestion="";//搜索
    //跳转论坛页面
    @RequestMapping("/Topics")
    public String Topics(Model model, @Param("page")String page){
        if(page.equals("xin")){
            model.addAttribute("mypagestat","xin");
            model.addAttribute("stat","xin");
        }else if(page.equals("jin")){
            model.addAttribute("mypagestat","jin");
            model.addAttribute("stat","jin");
        }else if(page.equals("re")){
            model.addAttribute("mypagestat","re");
            model.addAttribute("stat","re");
        }else {
            model.addAttribute("mypagestat","lun");
            model.addAttribute("stat","lun");
        }
        return "views/Topicshtml/Topics";
    }
//返回帖子list
    @RequestMapping("/mytopicsList")
    @ResponseBody
    public Map<String,Object> mytopicsList(Model model,Integer page, Integer limit){
        List<Topics> topicsListSub;
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<Topics> topicsList;
        int count=0;
        String mypagestat=(String) model.getAttribute("mypagestat");
        Pages pages=new Pages();
        if(mypagestat.equals("xin")){
            topicsListSub=topicsService.TopicsListbyxin_ten();
            if(topicsListSub == null) {
                return result;
            }
            count=10;
            topicsList = (List<Topics>) pages.listSub(topicsListSub, page, limit);
        }else if(mypagestat.equals("jin")){
            topicsListSub=topicsService.TopicsListbyjin_ten();
            if(topicsListSub == null) {
                return result;
            }
            count=10;
            topicsList = (List<Topics>) pages.listSub(topicsListSub, page, limit);
        }else if(mypagestat.equals("re")){
            topicsListSub=topicsService.TopicsListbyre_ten();
            if(topicsListSub == null) {
                return result;
            }
            count=10;
            topicsList = (List<Topics>) pages.listSub(topicsListSub, page, limit);
        }else {
            topicsList=topicsService.Listpage(page,limit);
            if(topicsList == null) {
                return result;
            }
            count=topicsService.Count();
        }
        result.put("data",topicsList);
        result.put("count",count);
        return result;
    }
//跳转上传帖子页面
    @RequestMapping("/Topic_up")
    public String Topic_up(){
        return "views/Topicshtml/Topics_up";
    }
//上传图片
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

    //添加帖子
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
        model.addAttribute("stat","xin");
        model.addAttribute("mypagestat","xin");
        return "views/Topicshtml/Topics";
    }
//查看帖子
    @RequestMapping("/Topic_see")
    public String Topic_see(Model model,@Param("id") Integer id){
        Topics topic=topicsService.SelectOne(id);
        model.addAttribute("topic",topic);
        return "views/Topicshtml/Topics_see";
    }
//点赞帖子
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
    //收藏帖子
    @RequestMapping("/Topic_Collect")
    public String Topic_Collect(Model model,@Param("id") Integer id){
        Collects collect=new Collects();
        Topics oldtopic=topicsService.SelectOne(id);
        Users user=(Users) model.getAttribute("user");
        collect.setTid(id);
        collect.setTname(oldtopic.getTitle());
        collect.setUid(user.getId());
        collect.setUname(oldtopic.getUser().getNickname());
        collectsService.Insertone(collect);
        Topics topic=topicsService.SelectOne(id);
        model.addAttribute("topic",topic);
        return "views/Topicshtml/Topics_see";
    }

    //跳转查询结果
   @RequestMapping("/findSignIn")
   public String findSignIn(Model model,@Param("question")String question){
       String myquestion=question;
       model.addAttribute("myquestion",myquestion);
       model.addAttribute("question",question);
       return "views/Topicshtml/findSignIn";
   }
   //查询结果list
    @RequestMapping("/findSignInlist")
    @ResponseBody
    public Map<String,Object> findSignInlist(Model model,Integer page, Integer limit){
        List<Topics> topicsListSub;
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        String myquestion=(String) model.getAttribute("myquestion");
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
//用户自己帖子
    @RequestMapping("/Personal_topic")
    public String Personal_topic(Model model){
        return "views/Usershtml/Personal_topic";
    }
//返回用户帖子列表
    @RequestMapping("/per_topicsList")
    @ResponseBody
    public Map<String,Object> per_topicsList(Model model,Integer page, Integer limit){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        Users user=(Users) model.getAttribute("user");
        List<Topics> topicsList=topicsService.TopicsListbyuid(page,limit,user.getId());
        if(topicsList == null) {
            return result;
        }
        int count=topicsService.Countbyuid(user.getId());
        result.put("data",topicsList);
        result.put("count",count);
        return result;
    }
    //用户查看帖子
    @RequestMapping("/Personal_Topic_see")
    public String Personal_Topic_see(Model model,@Param("id") Integer id){
        Topics topic=topicsService.SelectOne(id);
        model.addAttribute("topic",topic);
        return "views/Usershtml/Personal_Topics_see";
    }
    //用户删除帖子
    @RequestMapping("/Topic_delete")
    public String Topic_delete(Model model,@Param("id") Integer id){
        topicsService.DeleteTopics(id);
        return "views/Usershtml/Personal_topic";
    }


    //用户查看消息帖子
    @RequestMapping("/Personal_Topic_newssee")
    public String Personal_Topic_newssee(Model model,@Param("id") Integer id){
        Users user=(Users) model.getAttribute("user");
        newsService.Delete(id,user.getId());
        Topics topic=topicsService.SelectOne(id);
        model.addAttribute("topic",topic);
        return "views/Usershtml/Personal_Topics_see";
    }
    //修改页面
    @RequestMapping("/Modeify")
    public String Modeify(Model model,@Param("id") Integer id ){
        Topics topic=topicsService.SelectOne(id);
        topic.setCountnice(topic.getCountnice()+50);
        topic.setCountsee(topic.getCountsee()+50);
        topicsService.UpdateTopics(topic);
        return "views/Managershtml/Manager_topics";
    }
    //删除
    @RequestMapping("/delete")
    public String delete(Model model,@Param("id") Integer id){
        topicsService.DeleteTopics(id);
        return "views/Managershtml/Manager_topics";
    }

}
