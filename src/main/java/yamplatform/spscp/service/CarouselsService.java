package yamplatform.spscp.service;


import yamplatform.spscp.pojo.Carousels;

import java.util.List;

public interface CarouselsService {
    //查询一条数据
    public Carousels SelectOne(Integer id);
    //插入
    public int InsertCarousels(Carousels carousels);
    //更新
    public int UpdateCarousels(Carousels carousels);
    //查询列表
    public List<Carousels> CarouselsList();
    //删除
    public int Delete(Integer id);
    //总数
    public int Count();
    //分页
    public List<Carousels> Listpage(Integer page, Integer lim);
}
