package yamplatform.spscp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yamplatform.spscp.mapper.TopicsMapper;
import yamplatform.spscp.pojo.Comments;
import yamplatform.spscp.pojo.PhotoLibrarys;
import yamplatform.spscp.pojo.Topics;
import yamplatform.spscp.pojo.Users;

import java.util.List;

@Service
public class TopicsServiceImpl implements TopicsService{
    @Autowired
    TopicsMapper topicsMapper;
    @Autowired
    CommentsService commentsService;
    @Autowired
    UsersService usersService;
    @Override
    public Topics SelectOne(Integer id) {
        Topics topic=topicsMapper.SelectOne(id);
        if(topic!=null){
//            List<Comments> commentsList=commentsService.CommentsListbytid(topic.getId());
//            topic.setCommentsList(commentsList);
            Users user=usersService.SelectOnebyid(topic.getUid());
            topic.setUser(user);
        }
        return topic;
    }

    @Override
    public int InsertTopics(Topics topics) {
        int t=topicsMapper.InsertTopics(topics);
        return t;
    }

    @Override
    public int UpdateTopics(Topics topics) {
        int t=topicsMapper.UpdateTopics(topics);
        return t;
    }

    @Override
    public int DeleteTopics(Integer id) {
        commentsService.DeleteComments(id);
        int t=topicsMapper.DeleteTopics(id);
        //同时删除评论
        if(t!=0){
            commentsService.DeleteComments(t);
        }
        return t;
    }

    @Override
    public List<Topics> TopicsList() {
        List<Topics> topicsList=topicsMapper.TopicsList();
        if(topicsList!=null){
            for(Topics t:topicsList){
               // List<Comments> commentsList=commentsService.CommentsListbytid(t.getId());
               // t.setCommentsList(commentsList);
                Users user=usersService.SelectOnebyid(t.getUid());
                t.setUser(user);
            }
        }
        return topicsList;
    }

    @Override
    public List<Topics> TopicsListbyuid(Integer page, Integer lim,Integer uid) {
        List<Topics> topicsList=topicsMapper.TopicsListbyuid(page,lim,uid);
        if(topicsList!=null){
            for(Topics t:topicsList){
                //List<Comments> commentsList=commentsService.CommentsListbytid(t.getId());
                //t.setCommentsList(commentsList);
                Users user=usersService.SelectOnebyid(t.getUid());
                t.setUser(user);
            }
        }
        return topicsList;
    }

    public int Countbyuid(Integer uid){
        int t=topicsMapper.Countbyuid(uid);
        return t;

    }
    @Override
    public List<Topics> searchTopicsList(String question) {
        List<Topics> topicsList=topicsMapper.searchTopicsList(question);
        if(topicsList!=null){
            for(Topics t:topicsList){
               // List<Comments> commentsList=commentsService.CommentsListbytid(t.getId());
               // t.setCommentsList(commentsList);
                Users user=usersService.SelectOnebyid(t.getUid());
                t.setUser(user);
            }
        }
        return topicsList;
    }

    //条件查询
    @Override
    public List<Topics> TopicsListbyxin() {
        List<Topics> topicsList=topicsMapper.TopicsListbyxin();
        if(topicsList!=null){
            for(Topics t:topicsList){
                //List<Comments> commentsList=commentsService.CommentsListbytid(t.getId());
                //t.setCommentsList(commentsList);
                Users user=usersService.SelectOnebyid(t.getUid());
                t.setUser(user);
            }
        }
        return topicsList;
    }

    @Override
    public List<Topics> TopicsListbyxin_ten() {
        List<Topics> topicsList=topicsMapper.TopicsListbyxin_ten();
        if(topicsList!=null){
            for(Topics t:topicsList){
                //List<Comments> commentsList=commentsService.CommentsListbytid(t.getId());
               // t.setCommentsList(commentsList);
                Users user=usersService.SelectOnebyid(t.getUid());
                t.setUser(user);
            }
        }
        return topicsList;
    }

    @Override
    public List<Topics> TopicsListbyre() {
        List<Topics> topicsList=topicsMapper.TopicsListbyre();
        if(topicsList!=null){
            for(Topics t:topicsList){
               // List<Comments> commentsList=commentsService.CommentsListbytid(t.getId());
               // t.setCommentsList(commentsList);
                Users user=usersService.SelectOnebyid(t.getUid());
                t.setUser(user);
            }
        }
        return topicsList;
    }

    @Override
    public List<Topics> TopicsListbyre_ten() {
        List<Topics> topicsList=topicsMapper.TopicsListbyre_ten();
        if(topicsList!=null){
            for(Topics t:topicsList){
                //List<Comments> commentsList=commentsService.CommentsListbytid(t.getId());
               // t.setCommentsList(commentsList);
                Users user=usersService.SelectOnebyid(t.getUid());
                t.setUser(user);
            }
        }
        return topicsList;
    }

    @Override
    public List<Topics> TopicsListbyjin() {
        List<Topics> topicsList=topicsMapper.TopicsListbyjin();
        if(topicsList!=null){
            for(Topics t:topicsList){
                //List<Comments> commentsList=commentsService.CommentsListbytid(t.getId());
                //t.setCommentsList(commentsList);
                Users user=usersService.SelectOnebyid(t.getUid());
                t.setUser(user);
            }
        }
        return topicsList;
    }

    @Override
    public List<Topics> TopicsListbyjin_ten() {
        List<Topics> topicsList=topicsMapper.TopicsListbyjin_ten();
        if(topicsList!=null){
            for(Topics t:topicsList){
               // List<Comments> commentsList=commentsService.CommentsListbytid(t.getId());
               // t.setCommentsList(commentsList);
                Users user=usersService.SelectOnebyid(t.getUid());
                t.setUser(user);
            }
        }
        return topicsList;
    }

    @Override
    public int Count() {
        int t=topicsMapper.Count();
        return t;
    }

    @Override
    public List<Topics> Listpage(Integer page, Integer lim) {
        page=(page-1)*lim;
        List<Topics> topicsList=topicsMapper.Listpage(page,lim);
        if(topicsList!=null){
            for(Topics t:topicsList){
                Users user=usersService.SelectOnebyid(t.getUid());
                t.setUser(user);
            }
        }
        return topicsList;
    }
}
