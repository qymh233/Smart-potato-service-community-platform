package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Collects;
import yamplatform.spscp.pojo.Topics;

import java.util.List;

@Mapper
@Repository
public interface CollectsMapper {
    //删除
    public int Delete(@Param("id") Integer id);

    //删除
    public int Deletebytiduid(@Param("tid") Integer tid,@Param("uid") Integer uid);
    //返回集合
    public List<Collects> CollectsList(@Param("uid") Integer uid);
    //添加
    public int Insertone(@Param("collect") Collects collect);
    //总数
    public int Count(@Param("uid") Integer uid);
    //分页
    public List<Collects> Listpage(@Param("page")Integer page, @Param("lim")Integer lim,@Param("uid") Integer uid);
    //判断是否收藏
    public Integer hadcollect(@Param("uid") Integer uid,@Param("tid") Integer tid);
}
