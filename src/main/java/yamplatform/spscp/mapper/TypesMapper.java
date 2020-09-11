package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Types;

import java.util.List;

@Mapper
@Repository
public interface TypesMapper {

    //查询一条数据
    public Types SelectOne(@Param("id") Integer id);
    //插入
    public int InsertTypes(@Param("types") Types types);
    //更新
    public int UpdateTypes(@Param("types") Types types);
    //查询列表
    public List<Types>  typesList();
    //查询列表bycid
    public List<Types>  typesListbycid(@Param("cid") Integer cid);

}
