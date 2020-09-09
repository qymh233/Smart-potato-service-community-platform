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

import java.util.List;

@SpringBootTest
public class demotest {
    @Autowired
    RellinksService rellinksService;
    @Test
    void contextLoads() {
        List<Rellinks> rellinksList=rellinksService.RellinksList();
        for(Rellinks t:rellinksList){
            System.out.println(t);
        }
    }
}
