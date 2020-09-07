package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.CommentsMapper;
import yamplatform.spscp.pojo.Comments;
import yamplatform.spscp.pojo.Users;

import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {
    @Autowired
    CommentsMapper commentsMapper;
    @Autowired
    UsersService usersService;
    @Override
    public Comments SelectOne(Integer id) {
        Comments comment=commentsMapper.SelectOne(id);
        if(comment!=null){
            Users user=usersService.SelectOnebyid(comment.getUid());
            comment.setUser(user);
        }
        return comment;
    }

    @Override
    public int InsertComments(Comments comments) {
        int t=commentsMapper.InsertComments(comments);
        return t;
    }

    @Override
    public int UpdateComments(Comments comments) {
        int t=commentsMapper.UpdateComments(comments);
        return t;
    }

    @Override
    public List<Comments> CommentsList() {
        List<Comments> commentsList=commentsMapper.CommentsList();
        if(commentsList!=null){
            for(Comments c:commentsList){
                Users user=usersService.SelectOnebyid(c.getUid());
                c.setUser(user);
            }

        }
        return commentsList;
    }

    @Override
    public List<Comments> CommentsListbytid(Integer tid) {
        List<Comments> commentsList=commentsMapper.CommentsListbytid(tid);
        if(commentsList!=null){
            for(Comments c:commentsList){
                Users user=usersService.SelectOnebyid(c.getUid());
                c.setUser(user);
            }
        }
        return commentsList;
    }

}
