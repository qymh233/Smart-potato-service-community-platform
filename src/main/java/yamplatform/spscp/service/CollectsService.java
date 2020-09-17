package yamplatform.spscp.service;


import yamplatform.spscp.pojo.Collects;
import yamplatform.spscp.pojo.PhotoLibrarys;

import java.util.List;

public interface CollectsService{
    //删除
    public int Delete(Integer id);
    //返回集合
    public List<Collects> CollectsList(Integer uid);
    //添加
    public int Insertone(Collects collect);//总数
    public int Count(Integer uid);
    //分页
    public List<Collects> Listpage(Integer page, Integer lim,Integer uid);

}
