package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Rellinks;

import java.util.List;

@Mapper
@Repository
public interface RellinksMapper {

    //查询一条数据
    public Rellinks SelectOne(@Param("id") Integer id);
    //插入
    public int InsertRellinks(@Param("rellinks") Rellinks rellinks);
    //更新
    public int UpdateRellinks(@Param("rellinks") Rellinks rellinks);
    //查询列表
    public List<Rellinks>  RellinksList();
    //删除
    public int Delete(@Param("id") Integer id);
}
