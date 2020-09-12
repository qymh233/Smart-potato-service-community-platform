package yamplatform.spscp.service;

import yamplatform.spscp.pojo.Helps;

import java.util.List;

public interface HelpsService {
    //查询一条数据
    public Helps SelectOne(String title);

    public Helps Selectbyid(Integer id);
    //插入
    public int InsertHelp(Helps helps);
    //更新
    public int UpdateHelps(Helps helps);
    //查询所有帮助
    public List<Helps> helpsList();
    //删除
    public int Delete(Integer id);
}
