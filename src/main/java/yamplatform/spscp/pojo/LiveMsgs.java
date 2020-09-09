package yamplatform.spscp.pojo;

import java.util.Date;

public class LiveMsgs {
    private Integer id;
    private Integer uid;
    private String content;
    private Date newtime;

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

    @Override
    public String toString() {
        return "LiveMsgs{" +
                "id=" + id +
                ", uid=" + uid +
                ", content='" + content + '\'' +
                ", newtime=" + newtime +
                ", user=" + user +
                '}';
    }
}
