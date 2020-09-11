package yamplatform.spscp.service;

import yamplatform.spscp.pojo.Notices;

public interface NoticesService {
    //查询一条数据
    public Notices SelectOne(String title);
    //插入
    public int InsertNotice(Notices notice);
    //更新
    public int UpdateNotice(Notices notice);
}
