package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.PhotoLibrarys;
import yamplatform.spscp.pojo.Rellinks;

import java.util.List;

@Mapper
@Repository
public interface PhotoLibrarysMapper {

    //查询一条数据
    public PhotoLibrarys SelectOne(@Param("id") Integer id);
    //插入
    public int InsertphotoLibrarys(@Param("photoLibrarys") PhotoLibrarys photoLibrarys);
    //更新
    public int UpdatephotoLibrarys(@Param("photoLibrarys") PhotoLibrarys photoLibrarys);
    //查询列表
    public List<PhotoLibrarys>  photoLibrarysList();
    //删除
    public int Delete(@Param("id") Integer id);
    //模糊查询
    public List<PhotoLibrarys> likelist(@Param("findlikelist") List<String> findlikelist);
    //总数
    public int Count();
    //分页
    public List<PhotoLibrarys> Listpage(@Param("page")Integer page, @Param("lim")Integer lim);
}
