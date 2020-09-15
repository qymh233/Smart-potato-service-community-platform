package yamplatform.spscp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import yamplatform.spscp.config.UploadProperties;
import yamplatform.spscp.service.UploadFile;
import yamplatform.spscp.service.UploadFileQiniu;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/upload")
public class UploadFileController {
    @Autowired
    UploadProperties uploadProperties;

    @RequestMapping("/img")
    @ResponseBody
    public Map<String,Object> uploadFileYun(Model model, @RequestParam("file") MultipartFile file) {
        // 上传到七牛云
        UploadFile uploadFile = new UploadFileQiniu(uploadProperties.getQiniu());
        String res=uploadFile.uploadFile(file);
        res="http://"+res;
        Map map = new HashMap<String,Object>();
        map.put("msg","ok");
        map.put("code",0);
        map.put("url",res);
        return map;
    }
}
