package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Notices;

import java.util.List;

@Mapper
@Repository
public interface NoticesMapper {
    //查询一条数据
    public Notices SelectOne(@Param("title") String title);
    public Notices Selectbyid(@Param("id") Integer id);
    //插入一条公告
    public int InsertNotice(@Param("notice") Notices notice);
    //更新一条公告
    public int UpdateNotice(@Param("notice") Notices notice);

    //查询所有帮助
    public List<Notices> noticesList();
    //删除
    public  int Delete(@Param("id") Integer id);
}
