package yamplatform.spscp.service;

import yamplatform.spscp.pojo.Notices;

public interface NoticesService {
    //查询一条数据
    public Notices SelectOne(String title);
    //插入一条公告
    public int InsertNotice(Notices notice);
    //更新一条公告
    public int UpdateNotice(Notices notice);
}
