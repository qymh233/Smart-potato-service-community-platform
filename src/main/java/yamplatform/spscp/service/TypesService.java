package yamplatform.spscp.service;

import yamplatform.spscp.pojo.Topics;
import yamplatform.spscp.pojo.Types;

import java.util.List;

public interface TypesService {
    //查询一条数据
    public Types SelectOne(Integer id);
    //插入
    public int InsertTypes(Types types);
    //更新
    public int UpdateTypes(Types types);
    //查询列表
    public List<Types>  typesList();
    //查询列表bycid
    public List<Types>  typesListbycid(Integer cid);
    //删除
    public int Delete(Integer id);
    //总数
    public int Count(Integer cid);
    //分页
    public List<Types> Listpage(Integer page, Integer lim,Integer cid);

}
