package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Carousels;

import java.util.List;
@Mapper
@Repository
public interface CarouselMapper {
    //查询一条数据
    public Carousels SelectOne(@Param("id") Integer id);
    //插入
    public int InsertCarousels(@Param("carousels") Carousels carousels);
    //更新
    public int UpdateCarousels(@Param("carousels") Carousels carousels);
    //查询列表
    public List<Carousels> CarouselssList();
    //删除
    public int Delete(@Param("id") Integer id);
    //总数
    public int Count();
    //分页
    public List<Carousels> Listpage(@Param("page")Integer page, @Param("lim")Integer lim);
}
