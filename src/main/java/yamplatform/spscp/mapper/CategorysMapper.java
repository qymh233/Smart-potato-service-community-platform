package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Categorys;

import java.util.List;

@Mapper
@Repository
public interface CategorysMapper {

    //查询一条数据
    public Categorys SelectOne(@Param("id") Integer id);
    //插入
    public int InsertCategorys(@Param("categorys") Categorys categorys);
    //更新
    public int UpdateCategorys(@Param("categorys") Categorys categorys);
    //查询列表
    public List<Categorys>  CategorysList();
    //删除
    public int Delete(@Param("id") Integer id);
}
