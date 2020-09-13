package yamplatform.spscp.service;


import yamplatform.spscp.pojo.Collects;

import java.util.List;

public interface CollectsService{
    //删除
    public int Delete(Integer id);
    //返回集合
    public List<Collects> CollectsList(Integer uid);
    //添加
    public int Insertone(Collects collect);
}
