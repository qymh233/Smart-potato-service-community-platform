package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.NoticesMapper;
import yamplatform.spscp.pojo.Notices;
@Service
public class NoticesServiceImpl implements NoticesService {
    @Autowired
    NoticesMapper noticesMapper;
    @Override
    public Notices SelectOne(String title) {
        Notices notice=noticesMapper.SelectOne(title);
        return notice;
    }

    @Override
    public int InsertNotice(Notices notice) {
        int t=noticesMapper.InsertNotice(notice);
        return t;
    }

    @Override
    public int UpdateNotice(Notices notice) {
        int t=noticesMapper.UpdateNotice(notice);
        return t;
    }
}
