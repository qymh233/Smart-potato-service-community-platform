package yamplatform.spscp.service;


import org.apache.ibatis.annotations.Param;
import yamplatform.spscp.pojo.Collects;
import yamplatform.spscp.pojo.PhotoLibrarys;

import java.util.List;

public interface CollectsService{
    //删除
    public int Delete(Integer id);
    //删除
    public int Deletebytiduid(Integer tid,Integer uid);
    //返回集合
    public List<Collects> CollectsList(Integer uid);
    //添加
    public int Insertone(Collects collect);
    //总数
    public int Count(Integer uid);
    //分页
    public List<Collects> Listpage(Integer page, Integer lim,Integer uid);
    //判断是否收藏
    public Integer hadcollect(Integer uid,Integer tid);

}
