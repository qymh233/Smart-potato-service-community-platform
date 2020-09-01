package yamplatform.spscp.service;

import yamplatform.spscp.pojo.Helps;

public interface HelpsService {
    //查询一条数据
    public Helps SelectOne(String title);
    //插入一条公告
    public int InsertHelp(Helps helps);
    //更新一条公告
    public int UpdateHelps(Helps helps);
}
