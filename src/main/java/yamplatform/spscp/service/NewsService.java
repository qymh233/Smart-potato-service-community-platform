package yamplatform.spscp.service;


import yamplatform.spscp.pojo.News;
import yamplatform.spscp.pojo.Types;

import java.util.List;

public interface NewsService {
    //删除
    public int Delete(Integer tid,Integer uid);
    //返回集合
    public List<News> NewsList(Integer uid);
    //添加
    public int Insertone(News news);
    //总数
    public int Count(Integer uid);
    //分页
    public List<News> Listpage(Integer page, Integer lim,Integer uid);
}
