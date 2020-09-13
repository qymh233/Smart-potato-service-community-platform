package yamplatform.spscp.service;


import yamplatform.spscp.pojo.News;

import java.util.List;

public interface NewsService {
    //删除
    public int Delete(Integer tid,Integer uid);
    //返回集合
    public List<News> NewsList(Integer uid);
    //添加
    public int Insertone(News news);
}
