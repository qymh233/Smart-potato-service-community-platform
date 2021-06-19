package yamplatform.spscp.service;


import yamplatform.spscp.pojo.Comments;
import yamplatform.spscp.pojo.LiveMsgs;


import java.util.List;

public interface CommentsService {
    //查询一条数据
    public Comments SelectOne(Integer id);
    //插入
    public int InsertComments(Comments comments);
    //更新
    public int UpdateComments(Comments comments);
    //删除
    public int DeleteComments(Integer tid);
    //查询列表
    public List<Comments>  CommentsList();
    //查询列表byuid
    public List<Comments>  CommentsListbytid(Integer tid);

    //总数
    public int Count(Integer tid);
    //分页
    public List<Comments> Listpage(Integer tid,Integer page, Integer lim);

}
