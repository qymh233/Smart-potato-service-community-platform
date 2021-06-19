package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Managers;

@Mapper
@Repository
public interface ManagersMapper {
    //查询一条数据
    public Managers SelectOne(@Param("username") String username);
    public Managers SelectOnebyid(@Param("id")Integer id);
}
