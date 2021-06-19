package yamplatform.spscp.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class Topics {
    //帖子
    private Integer id;
    private String title; // 标题
    private String content; // 内容
    private String picturl; // 内容
    private Integer countnice = 0; // 点赞数
    private Integer countsee = 0; // 查看数
    private Date topicTime; // 发布时间
    private Integer uid;//用户id
    private Integer status = 0; // 帖子状态：0未结帖，1已结贴

    private Users User;
    // 集合，一对多
    private List<Comments> commentsList;//回复

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicturl() {
        return picturl;
    }

    public void setPicturl(String picturl) {
        this.picturl = picturl;
    }

    public Integer getCountnice() {
        return countnice;
    }

    public void setCountnice(Integer countnice) {
        this.countnice = countnice;
    }

    public Integer getCountsee() {
        return countsee;
    }

    public void setCountsee(Integer countsee) {
        this.countsee = countsee;
    }

    public Date getTopicTime() {
        return topicTime;
    }

    public void setTopicTime(Date topicTime) {
        this.topicTime = topicTime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Users getUser() {
        return User;
    }

    public void setUser(Users user) {
        User = user;
    }

    public List<Comments> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<Comments> commentsList) {
        this.commentsList = commentsList;
    }

    @Override
    public String toString() {
        return "Topics{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", picturl='" + picturl + '\'' +
                ", countnice=" + countnice +
                ", countsee=" + countsee +
                ", topicTime=" + topicTime +
                ", uid=" + uid +
                ", status=" + status +
                ", User=" + User +
                ", commentsList=" + commentsList +
                '}';
    }
}
