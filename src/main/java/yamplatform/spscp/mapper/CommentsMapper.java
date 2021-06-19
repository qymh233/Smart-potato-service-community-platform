package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Comments;
import yamplatform.spscp.pojo.LiveMsgs;

import java.util.List;

@Mapper
@Repository
public interface CommentsMapper {

    //查询一条数据
    public Comments SelectOne(@Param("id") Integer id);
    //插入
    public int InsertComments(@Param("comments") Comments comments);
    //更新
    public int UpdateComments(@Param("comments") Comments comments);
    //删除
    public int DeleteComments(@Param("tid") Integer tid);
    //查询列表
    public List<Comments>  CommentsList();
    //查询列表byuid
    public List<Comments>  CommentsListbytid(@Param("tid") Integer tid);

    //总数
    public int Count(@Param("tid") Integer tid);
    //分页
    public List<Comments> Listpage(@Param("tid") Integer tid,@Param("page")Integer page, @Param("lim")Integer lim);


}
