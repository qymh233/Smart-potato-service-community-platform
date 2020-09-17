package yamplatform.spscp.service;

import yamplatform.spscp.pojo.Categorys;
import yamplatform.spscp.pojo.News;

import java.util.List;

public interface CategorysService {
    //查询一条数据
    public Categorys SelectOne(Integer id);
    //插入
    public int InsertCategorys(Categorys categorys);
    //更新
    public int UpdateCategorys(Categorys categorys);
    //查询列表
    public List<Categorys> CategorysList();
    //删除
    public int Delete(Integer id);
    //总数
    public int Count();
    //分页
    public List<Categorys> Listpage(Integer page, Integer lim);
}
