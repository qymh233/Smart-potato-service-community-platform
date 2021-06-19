package yamplatform.spscp.service;


import yamplatform.spscp.pojo.Rellinks;

import java.util.List;

public interface RellinksService {
    //查询一条数据
    public Rellinks SelectOne(Integer id);
    //插入
    public int InsertRellinks(Rellinks rellinks);
    //更新
    public int UpdateRellinks(Rellinks rellinks);
    //查询列表
    public List<Rellinks>  RellinksList();
    //删除
    public int Delete(Integer id);
    //总数
    public int Count();
    //分页
    public List<Rellinks> Listpage(Integer page, Integer lim);

}
