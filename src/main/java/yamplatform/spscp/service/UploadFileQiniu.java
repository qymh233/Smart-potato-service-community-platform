package yamplatform.spscp.service;

import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.web.multipart.MultipartFile;
import yamplatform.spscp.config.UploadProperties;
import java.io.IOException;
import java.util.UUID;

public class UploadFileQiniu implements UploadFile{
    private UploadProperties.Qiniu properties;

    //构造一个带指定Region对象的配置类
    private Configuration cfg = new Configuration(Region.huabei());
    private UploadManager uploadManager;

    public UploadFileQiniu(UploadProperties.Qiniu properties) {
        this.properties = properties;
    }
    @Override
    public String uploadFile(MultipartFile file) {
        cfg.useHttpsDomains = false;
        uploadManager= new UploadManager(cfg);
        Auth auth = Auth.create(properties.getAccessKey(), properties.getSecretKey());
       // String token = auth.uploadToken(properties.getBucket());
        String qiNiuToken = auth.uploadToken(properties.getBucket());
        try {
            String originalFilename = file.getOriginalFilename();
            // 文件后缀
            String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
            String fileKey = UUID.randomUUID().toString() + suffix;
            Response response = uploadManager.put(file.getInputStream(), fileKey, qiNiuToken, null, null);
            return properties.getDomain() + "/"+fileKey;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }
}
