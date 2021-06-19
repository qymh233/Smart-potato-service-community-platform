package yamplatform.spscp.service;

import yamplatform.spscp.pojo.LiveMsgs;

import java.util.List;

public interface LiveMsgsService {
    //查询一条数据
    public LiveMsgs SelectOne(Integer id);
    //插入
    public int InsertLiveMsgs(LiveMsgs liveMsgs);
    //查询列表
    public List<LiveMsgs> LiveMsgsList();
    //更新回复
    public int UpdateLiveMsgsRecont(Integer id,String recont);
    //总数
    public int Count();
    //分页
    public List<LiveMsgs> Listpage(Integer page, Integer lim);
}
