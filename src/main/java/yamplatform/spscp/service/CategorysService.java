package yamplatform.spscp.service;

import yamplatform.spscp.pojo.Categorys;

import java.util.List;

public interface CategorysService {
    //查询一条数据
    public Categorys SelectOne(Integer id);
    //插入一条帮助
    public int InsertCategorys(Categorys categorys);
    //更新一条帮助
    public int UpdateCategorys(Categorys categorys);
    //查询列表
    public List<Categorys> CategorysList();
}
