package yamplatform.spscp.pojo;

import java.util.Date;

public class Helps {
    //帮助
    private int id;
    private String title;//标题
    private String content;//内容
    private Date newtime;//时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getNewtime() {
        return newtime;
    }

    public void setNewtime(Date newtime) {
        this.newtime = newtime;
    }

    @Override
    public String toString() {
        return "Helps{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", newtime=" + newtime +
                '}';
    }
}
