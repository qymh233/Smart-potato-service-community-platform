package yamplatform.spscp.service;

import yamplatform.spscp.pojo.Helps;

public interface HelpsService {
    //查询一条数据
    public Helps SelectOne(String title);
    //插入
    public int InsertHelp(Helps helps);
    //更新
    public int UpdateHelps(Helps helps);
}
