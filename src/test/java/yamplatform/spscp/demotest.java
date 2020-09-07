package yamplatform.spscp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yamplatform.spscp.mapper.CategorysMapper;
import yamplatform.spscp.mapper.HelpsMapper;
import yamplatform.spscp.mapper.NoticesMapper;
import yamplatform.spscp.mapper.TypesMapper;
import yamplatform.spscp.pojo.*;
import yamplatform.spscp.service.CategorysService;
import yamplatform.spscp.service.PhotoLibrarysService;

import java.util.List;

@SpringBootTest
public class demotest {
    @Autowired
    PhotoLibrarysService photoLibrarysService;
    @Test
    void contextLoads() {
        PhotoLibrarys photoLibrary = photoLibrarysService.SelectOne(6);
        photoLibrary.setConDownload(photoLibrary.getConDownload()+1);
        photoLibrarysService.UpdatePhotoLibrarys(photoLibrary);
    }
}
