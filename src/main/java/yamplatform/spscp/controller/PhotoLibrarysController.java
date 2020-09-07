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

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/PhotoLibrarys")
@SessionAttributes({"user"})
public class PhotoLibrarysController {
    @Autowired
    PhotoLibrarysService photoLibrarysService;
    @RequestMapping("/PhotoLibrary")
    public String PhotoLibrary(Model model){
        List<PhotoLibrarys> photoLibrarysList=photoLibrarysService.PhotoLibrarysList();
        model.addAttribute("photoLibrarysList",photoLibrarysList);
        return "views/PhotoLibraryshtml/PhotoLibrary";
    }
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
            // TODO Auto-generated catch block
            map.put("msg","error");
            map.put("code",100);
            e.printStackTrace();
        }

        return map;
        //return "{\"code\":0, \"msg\":\"success\", \"fileUrl\":\"" + pathString + "\"}";

    }

}
