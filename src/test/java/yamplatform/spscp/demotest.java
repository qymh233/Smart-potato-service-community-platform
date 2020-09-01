package yamplatform.spscp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yamplatform.spscp.mapper.HelpsMapper;
import yamplatform.spscp.mapper.NoticesMapper;
import yamplatform.spscp.pojo.Helps;

@SpringBootTest
public class demotest {
    @Autowired
    HelpsMapper helpsMapper;
    @Test
    void contextLoads() {
        System.out.println(1111);
        String title="登陆与注册";
        Helps helps=helpsMapper.SelectOne(title);
        System.out.println(helps);

    }
}
