package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Collects;

import java.util.List;

@Mapper
@Repository
public interface CollectsMapper {
    //删除
    public int Delete(@Param("id") Integer id);
    //返回集合
    public List<Collects> CollectsList(@Param("uid") Integer uid);
    //添加
    public int Insertone(@Param("collect") Collects collect);
}
