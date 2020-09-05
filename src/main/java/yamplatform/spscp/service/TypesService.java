package yamplatform.spscp.service;

import yamplatform.spscp.pojo.Types;

import java.util.List;

public interface TypesService {
    //查询一条数据
    public Types SelectOne(Integer id);
    //插入一条帮助
    public int InsertTypes(Types types);
    //更新一条帮助
    public int UpdateTypes(Types types);
    //查询列表
    public List<Types>  typesList();
    //查询列表bycid
    public List<Types>  typesListbycid(Integer cid);
}
