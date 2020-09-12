package yamplatform.spscp.service;

import yamplatform.spscp.pojo.Notices;

import java.util.List;

public interface NoticesService {
    //查询一条数据
    public Notices SelectOne(String title);
    public Notices Selectbyid(Integer id);
    //插入
    public int InsertNotice(Notices notice);
    //更新
    public int UpdateNotice(Notices notice);

    //查询所有帮助
    public List<Notices> noticesList();
    //删除
    public  int Delete(Integer id);
}
