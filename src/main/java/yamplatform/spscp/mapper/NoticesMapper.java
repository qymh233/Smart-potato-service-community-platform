package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Notices;

@Mapper
@Repository
public interface NoticesMapper {
    //查询一条数据
    public Notices SelectOne(@Param("title") String title);
    //插入一条公告
    public int InsertNotice(@Param("notice") Notices notice);
    //更新一条公告
    public int UpdateNotice(@Param("notice") Notices notice);
}
