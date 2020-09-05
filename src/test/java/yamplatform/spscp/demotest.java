package yamplatform.spscp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yamplatform.spscp.mapper.CategorysMapper;
import yamplatform.spscp.mapper.HelpsMapper;
import yamplatform.spscp.mapper.NoticesMapper;
import yamplatform.spscp.mapper.TypesMapper;
import yamplatform.spscp.pojo.Categorys;
import yamplatform.spscp.pojo.Helps;
import yamplatform.spscp.pojo.Types;
import yamplatform.spscp.service.CategorysService;

import java.util.List;

@SpringBootTest
public class demotest {
    @Autowired
    CategorysService categorysService;
    @Test
    void contextLoads() {
        List<Categorys> categorysList=categorysService.CategorysList();
        for(Categorys c:categorysList){
            System.out.println(c);
        }
    }
}
