package yamplatform.spscp.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import yamplatform.spscp.pojo.PhotoLibrarys;
import yamplatform.spscp.pojo.Users;
import yamplatform.spscp.service.PhotoLibrarysService;
import yamplatform.spscp.util.Pages;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/PhotoLibrarys")
@SessionAttributes({"user","manager","manager_photolibrarys","findlikelist"})
public class PhotoLibrarysController {
    @Autowired
    PhotoLibrarysService photoLibrarysService;
    //跳转图片库首页
    @RequestMapping("/PhotoLibrary")
    public String PhotoLibrary(Model model){
        return "views/PhotoLibraryshtml/PhotoLibrary";
    }
    //返回图片list
    @RequestMapping("/photoLibrarysList")
    @ResponseBody
    public Map<String,Object> photoLibrarysList(Model model,Integer page, Integer limit){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<PhotoLibrarys> photoLibrarysList=photoLibrarysService.Listpage(page,limit);
        if(photoLibrarysList == null) {
            return result;
        }
        int count=photoLibrarysService.Count();
        result.put("data",photoLibrarysList);
        result.put("count",count);
        return result;
    }
//查看具体内容
    @RequestMapping("/PhotoLibrary_see")
    public String PhotoLibrary_see(Model model, @Param("id")Integer id) {
        PhotoLibrarys photoLibrary = photoLibrarysService.SelectOne(id);
        photoLibrary.setConDownload(photoLibrary.getConDownload()+1);
        photoLibrarysService.UpdatePhotoLibrarys(photoLibrary);
        model.addAttribute("photoLibrary", photoLibrary);
        return "views/PhotoLibraryshtml/PhotoLibrary_see";
    }
    //上传
    @RequestMapping("/PhotoLibrary_upload")
    public String PhotoLibrary_upload(Model model){
        return "views/PhotoLibraryshtml/PhotoLibrary_upload";
    }
   @RequestMapping(value="/uploadSource" , method = RequestMethod.POST)
   @ResponseBody
   public Map<String,Object> downloadimg(Model model,@RequestParam("file") MultipartFile file) {
       Map map = new HashMap<String,Object>();
       System.out.println(file);
       String pathString = null;
       String dburl;
       String fname=null;
       if(file!=null) {
           String filename = file.getOriginalFilename();
           //Check for Unix-style path
           int unixSep = filename.lastIndexOf('/');
           //Check for Windows-style path
           int winSep = filename.lastIndexOf('\\');
           //cut off at latest possible point
           int pos = (winSep > unixSep ? winSep:unixSep);
           if (pos != -1)
               filename = filename.substring(pos + 1);
           fname=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" +filename;
           pathString = "E:\\ideaproject\\spscp\\src\\main\\resources\\static\\img\\PhotoLibrary\\" + fname;
       }
       try {
           File files=new File(pathString);
           //打印查看上传路径
           if(!files.getParentFile().exists()){
               files.getParentFile().mkdirs();
           }
           file.transferTo(files);
           map.put("msg","ok");
           map.put("code",0);
           dburl="http://localhost:8080/img/PhotoLibrary/"+fname;
           map.put("url",dburl);
       } catch (Exception e) {
           map.put("msg","error");
           map.put("code",100);
           e.printStackTrace();
       }
       return map;
   }
    @RequestMapping("/photolibrarys_add")
    public String photolibrarys_add(Model model,@Param("title") String title,@Param("content")String cont,@Param("picturl")String picturl){
        Users user=(Users) model.getAttribute("user");
        PhotoLibrarys photoLibrary=new PhotoLibrarys();
        photoLibrary.setTitle(title);
        photoLibrary.setUrl(picturl);
        if(cont!=null&&!cont.equals("")){
            photoLibrary.setDescribed(cont);
        }
        photoLibrary.setUid(user.getId());
        photoLibrarysService.InsertPhotoLibrarys(photoLibrary);
        return "views/PhotoLibraryshtml/PhotoLibrary";
    }
    //修改页面
    @RequestMapping("/Modeify")
    public String Modeify(Model model,@Param("id") Integer id ){
        PhotoLibrarys photoLibrary=photoLibrarysService.SelectOne(id);
        model.addAttribute("manager_photolibrarys",photoLibrary);
        return "views/Managershtml/Modeify_photolibrarys";
    }
    @RequestMapping("/Modeify_photolibrarys")
    public String Modeify_photolibrarys(Model model,@Param("title") String title,@Param("url") String url,@Param("cont") String cont){
        PhotoLibrarys photoLibrary=(PhotoLibrarys) model.getAttribute("manager_photolibrarys");
        if(title!=null&&!title.equals("")){
            photoLibrary.setTitle(title);
        }
        if(cont!=null&&!cont.equals("")){
            photoLibrary.setDescribed(cont);
        }
        if(url!=null&&!url.equals("")){
            photoLibrary.setUrl(cont);
        }
        photoLibrarysService.UpdatePhotoLibrarys(photoLibrary);
        return "views/Managershtml/Manager_photolibrarys";
    }
    //删除
    @RequestMapping("/delete")
    public String delete(Model model,@Param("id") Integer id){
        photoLibrarysService.Delete(id);
        return "views/Managershtml/Manager_photolibrarys";
    }
    //模糊查询
    @RequestMapping("/findlike")
    public   String findlike(Model model,@Param("title") String title){
        String question=title;
        String[] strArr = question.split("/");
        List<String> res=new ArrayList<>();
        for(String s:strArr){
            res.add(s);
        }
       model.addAttribute("findlikelist",res);
        return "views/PhotoLibraryshtml/PhotoLibrary_findlike";
    }
    //返回图片list
    @RequestMapping("/findlikeList")
    @ResponseBody
    public Map<String,Object> findlikeList(Model model,Integer page, Integer limit){
        List<PhotoLibrarys> photoLibrarysListSub;
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<String> findlikelist=(List<String>) model.getAttribute("findlikelist");
        List<PhotoLibrarys> photoLibrarysList=photoLibrarysService.likelist(findlikelist);
        if(photoLibrarysList == null) {
            return result;
        }
        Pages pages=new Pages();
        photoLibrarysListSub = (List<PhotoLibrarys>) pages.listSub(photoLibrarysList, page, limit);
        result.put("data",photoLibrarysListSub);
        result.put("count",photoLibrarysList.size());
        return result;
    }
}
