package yamplatform.spscp.service;


import yamplatform.spscp.pojo.Comments;


import java.util.List;

public interface CommentsService {
    //查询一条数据
    public Comments SelectOne(Integer id);
    //插入一条帮助
    public int InsertComments(Comments comments);
    //更新一条帮助
    public int UpdateComments(Comments comments);
    //查询列表
    public List<Comments>  CommentsList();
    //查询列表byuid
    public List<Comments>  CommentsListbytid(Integer tid);

}
