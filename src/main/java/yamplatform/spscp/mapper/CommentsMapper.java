package yamplatform.spscp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yamplatform.spscp.pojo.Comments;

import java.util.List;

@Mapper
@Repository
public interface CommentsMapper {

    //查询一条数据
    public Comments SelectOne(@Param("id") Integer id);
    //插入一条帮助
    public int InsertComments(@Param("comments") Comments comments);
    //更新一条帮助
    public int UpdateComments(@Param("comments") Comments comments);
    //删除一条帮助
    public int DeleteComments(@Param("tid") Integer tid);
    //查询列表
    public List<Comments>  CommentsList();
    //查询列表byuid
    public List<Comments>  CommentsListbytid(@Param("tid") Integer tid);


}
