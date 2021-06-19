package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.NoticesMapper;
import yamplatform.spscp.pojo.Helps;
import yamplatform.spscp.pojo.Notices;

import java.util.List;

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
    public Notices Selectbyid(Integer id) {
        Notices notice=noticesMapper.Selectbyid(id);
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

    @Override
    public List<Notices> noticesList() {
        List<Notices> noticesList=noticesMapper.noticesList();
        return noticesList;
    }

    @Override
    public int Delete(Integer id) {
        int t=noticesMapper.Delete(id);
        return t;
    }

    @Override
    public int Count() {
        int t=noticesMapper.Count();
        return t;
    }

    @Override
    public List<Notices> Listpage(Integer page, Integer lim) {
        page=(page-1)*lim;
        List<Notices> noticesList=noticesMapper.Listpage(page,lim);
        return noticesList;
    }
}
