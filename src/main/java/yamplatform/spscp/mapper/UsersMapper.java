package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Users;

@Mapper
@Repository
public interface UsersMapper {
    //查询一条数据
    public Users SelectOne(@Param("username") String username);
    public Users SelectOnebyid(@Param("id")Integer id);
    //插入一条帮助
    public int InsertUsers(@Param("users") Users users);
    //更新一条帮助
    public int UpdateUsers(@Param("users") Users users);
}
