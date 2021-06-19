package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import yamplatform.spscp.pojo.*;
import yamplatform.spscp.service.CommentsService;
import yamplatform.spscp.service.NewsService;
import yamplatform.spscp.service.TopicsService;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Comments")
@SessionAttributes({"user"})
public class CommentsController {
    @Autowired
    CommentsService commentsService;
    @Autowired
    TopicsService topicsService;
    @Autowired
    NewsService newsService;
    //图片上传
//    @RequestMapping(value = "/uploadsee" , method = RequestMethod.POST)
//    @ResponseBody
//    public Map<String, Object> uploadsee(HttpServletRequest servletRequest,
//                                         @RequestParam("file") MultipartFile file
//    ) throws IOException {
//        //如果文件内容不为空，则写入上传路径
//        if (!file.isEmpty()) {
//            //上传文件路径
//            String path = "E:\\ideaproject\\spscp\\src\\main\\resources\\static\\img\\Comments\\" ;
//            //上传文件名
//            String filename = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" +file.getOriginalFilename();
//            File filepath = new File(path, filename);
//            //判断路径是否存在，没有就创建一个
//            if (!filepath.getParentFile().exists()) {
//                filepath.getParentFile().mkdirs();
//            }
//            //将上传文件保存到一个目标文档中
//            File file1 = new File(path + File.separator + filename);
//            file.transferTo(file1);
//            Map<String, Object> res = new HashMap<>();
//            String dburl="http://localhost:8080/img/Comments/"+filename;
//            //返回的是一个url对象
//            res.put("url", dburl);
//            res.put("msg","ok");
//            res.put("code",0);
//            return res;
//        } else {
//            Map<String, Object> res = new HashMap<>();
//            //返回的是一个url对象
//            res.put("url", null);
//            res.put("msg","no");
//            res.put("code",100);
//            return res;
//        }
//    }
    //添加评论
    @RequestMapping("/comment_add")
    public String comment_add(Model model,@Param("content")String cont, @Param("picturl")String picturl,@Param("id") Integer id){
        //封装评论
        Comments comment=new Comments();
        comment.setContent(cont);
        comment.setTid(id);
        if(picturl!=null){
            comment.setPicturl(picturl);
        }
        Users user=(Users)model.getAttribute("user");
        comment.setUid(user.getId());
        commentsService.InsertComments(comment);
        //封装向用户发送的消息
        Topics topic=topicsService.SelectOne(id);
        if(topic.getUser().getId()!=user.getId()){
            News news=new News();
            news.setTid(id);
            news.setTname(topic.getTitle());
            news.setUid(topic.getUser().getId());
            news.setUname(user.getNickname());
            news.setUpid(user.getId());
            newsService.Insertone(news);
        }
        //返回帖子
        model.addAttribute("topic",topic);
        return "views/Topicshtml/Topics_see";
    }
    //消息列表
    @RequestMapping("comment_see")
    @ResponseBody
    public Map<String,Object> comment_see(Integer id,Model model, Integer page){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<Comments> commentsList=commentsService.Listpage(id,page,6);
        if(commentsList == null) {
            return result;
        }
        int count=commentsService.Count(id);
        int counts=count/6+1;
        result.put("data",commentsList);
        result.put("pages",counts);
        return result;
    }
}
