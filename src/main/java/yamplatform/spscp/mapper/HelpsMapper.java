package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Helps;
import yamplatform.spscp.pojo.Notices;

import java.util.List;

@Mapper
@Repository
public interface HelpsMapper {
    //查询一条数据
    public Helps SelectOne(@Param("title") String title);

    public Helps Selectbyid(@Param("id") Integer id);
    //插入一条帮助
    public int InsertHelps(@Param("helps") Helps helps);
    //更新一条帮助
    public int UpdateHelps(@Param("helps") Helps helps);

    //查询所有帮助
    public List<Helps> helpsList();
    //删除
    public  int Delete(@Param("id") Integer id);
    //总数
    public int Count();
    //分页
    public List<Helps> Listpage(@Param("page")Integer page, @Param("lim")Integer lim);

}
