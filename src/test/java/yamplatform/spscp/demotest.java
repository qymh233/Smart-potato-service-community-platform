package yamplatform.spscp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yamplatform.spscp.mapper.*;
import yamplatform.spscp.pojo.*;
import yamplatform.spscp.service.CategorysService;
import yamplatform.spscp.service.PhotoLibrarysService;

import java.util.List;

@SpringBootTest
public class demotest {
    @Autowired
    TopicsMapper topicsMapper;
    @Test
    void contextLoads() {
        List<Topics> topicsList=topicsMapper.TopicsListbyjin_ten();
        for(Topics t:topicsList){
            System.out.println(t);
        }
    }
}
