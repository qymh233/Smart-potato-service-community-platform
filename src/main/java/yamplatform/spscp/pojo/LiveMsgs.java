package yamplatform.spscp.pojo;

import java.util.Date;

public class LiveMsgs {
    //留言
    private Integer id;
    private Integer uid;
    private String content;//内容
    private String recont="请等待管理员回复";//回复
    private Date newtime;//时间

    private Users user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getNewtime() {
        return newtime;
    }

    public void setNewtime(Date newtime) {
        this.newtime = newtime;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getRecont() {
        return recont;
    }

    public void setRecont(String recont) {
        this.recont = recont;
    }

    @Override
    public String toString() {
        return "LiveMsgs{" +
                "id=" + id +
                ", uid=" + uid +
                ", content='" + content + '\'' +
                ", recont='" + recont + '\'' +
                ", newtime=" + newtime +
                ", user=" + user +
                '}';
    }
}
