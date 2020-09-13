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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/PhotoLibrarys")
@SessionAttributes({"user","manager","manager_photolibrarys"})
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
        List<PhotoLibrarys> photoLibrarysListSub;
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("code", 0);
        List<PhotoLibrarys> photoLibrarysList=photoLibrarysService.PhotoLibrarysList();
        if(photoLibrarysList == null) {
            return result;
        }
        Pages pages=new Pages();
        photoLibrarysListSub = (List<PhotoLibrarys>) pages.listSub(photoLibrarysList, page, limit);
        result.put("data",photoLibrarysListSub);
        result.put("count",photoLibrarysList.size());
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
   /* @RequestMapping(value="/uploadSource" , method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> downloadimg(Model model,@RequestParam("file") MultipartFile file) {
        System.out.println(file);
        String pathString = null;
        String dbname=null;
        String dburl;
        if(file!=null) {
            //获取上传的文件名称
            String filename = file.getOriginalFilename();
            //Check for Unix-style path
            int unixSep = filename.lastIndexOf('/');
            //Check for Windows-style path
            int winSep = filename.lastIndexOf('\\');
            //cut off at latest possible point
            int pos = (winSep > unixSep ? winSep:unixSep);
            if (pos != -1)
                filename = filename.substring(pos + 1);
            String fname=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" +filename;
            String newstr=filename.substring(filename.length() - 3);
            if(newstr.equals("jpg")||newstr.equals("png")){
                dbname="马铃薯图片";
            }else if(newstr.equals("zip")||newstr.equals("rar")){
                dbname="马铃薯图片压缩包";
            }else {
                dbname=fname;
            }
            pathString = "E:\\ideaproject\\spscp\\src\\main\\resources\\static\\img\\PhotoLibrary\\" + fname;//上传到本地
        }
        Map map = new HashMap<String,Object>();
        try {
            File files=new File(pathString);//在内存中创建File文件映射对象
            //打印查看上传路径
            System.out.println(pathString);
            if(!files.getParentFile().exists()){//判断映射文件的父文件是否真实存在
                files.getParentFile().mkdirs();//创建所有父文件夹
            }
            file.transferTo(files);//采用file.transferTo 来保存上传的文件
            map.put("msg","ok");
            map.put("code",0);
            dburl="http://localhost:8080/img/PhotoLibrary/"+dbname;
            PhotoLibrarys photoLibrary=new PhotoLibrarys();
            photoLibrary.setTitle(dbname);
            photoLibrary.setUrl(dburl);
            Users user=(Users)model.getAttribute("user");
            photoLibrary.setUid(user.getId());
            photoLibrarysService.InsertPhotoLibrarys(photoLibrary);
        } catch (Exception e) {
            map.put("msg","error");
            map.put("code",100);
            e.printStackTrace();
        }
        return map;
    }*/
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

}
