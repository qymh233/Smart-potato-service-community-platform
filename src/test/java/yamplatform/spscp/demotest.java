package yamplatform.spscp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yamplatform.spscp.mapper.*;
import yamplatform.spscp.pojo.*;
import yamplatform.spscp.service.CategorysService;
import yamplatform.spscp.service.PhotoLibrarysService;
import yamplatform.spscp.service.RellinksService;
import yamplatform.spscp.service.TopicsService;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class demotest {
    @Autowired
    PhotoLibrarysService photoLibrarysService;
    @Test
    void contextLoads() {
        String question="淀粉/氮";
        String[] strArr = question.split("/");
        List<String> res=new ArrayList<>();
        for(String s:strArr){
            res.add(s);
        }
        for(String r:res){
            System.out.println(r);
        }
        List<PhotoLibrarys> photoLibrarysList=photoLibrarysService.likelist(res);
        for(PhotoLibrarys p:photoLibrarysList){
            System.out.println(p);
        }


    }
}
