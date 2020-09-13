package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.News;

import java.util.List;

@Mapper
@Repository
public interface NewsMapper {
    //删除
    public int Delete(@Param("tid") Integer tid,@Param("uid") Integer uid);
    //返回集合
    public List<News> NewsList(@Param("uid") Integer uid);
    //添加
    public int Insertone(@Param("news") News news);
}
