package yamplatform.spscp.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadFile {
    String uploadFile(MultipartFile file);
}
