package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.LiveMsgs;

import java.util.List;

@Mapper
@Repository
public interface LiveMsgsMapper {

    //查询一条数据
    public LiveMsgs SelectOne(@Param("id") Integer id);
    //插入
    public int InsertLiveMsgs(@Param("liveMsgs") LiveMsgs liveMsgs);
    //查询列表
    public List<LiveMsgs>  LiveMsgsList();
}
