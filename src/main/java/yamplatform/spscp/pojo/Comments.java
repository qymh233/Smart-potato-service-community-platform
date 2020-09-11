package yamplatform.spscp.pojo;

import java.util.Date;

public class Comments {
    //回复/评论
    private int id;
    private String content; // 内容
    private String picturl; // 内容
    private Date commentTime;//回复时间
    private Integer countnice = 0; // 点赞数
    private Integer uid;//用户id
    private Integer tid;//帖子id
    private int status;  //评论的状态，是否被删除，0表示没有，1表示被删除
    // 多对一
    private Users User;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Users getUser() {
        return User;
    }

    public void setUser(Users user) {
        User = user;
    }

    public Integer getCountnice() {
        return countnice;
    }

    public void setCountnice(Integer countnice) {
        this.countnice = countnice;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", picturl='" + picturl + '\'' +
                ", commentTime=" + commentTime +
                ", countnice=" + countnice +
                ", uid=" + uid +
                ", tid=" + tid +
                ", status=" + status +
                ", User=" + User +
                '}';
    }
}
