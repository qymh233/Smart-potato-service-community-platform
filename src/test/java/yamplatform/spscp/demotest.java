package yamplatform.spscp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yamplatform.spscp.mapper.NoticesMapper;

@SpringBootTest
public class demotest {
    @Autowired
    NoticesMapper noticeMapper;
    @Test
    void contextLoads() {
        System.out.println(1111);
        String title="隐私和版权";
        System.out.println(noticeMapper.SelectOne(title));

    }
}
