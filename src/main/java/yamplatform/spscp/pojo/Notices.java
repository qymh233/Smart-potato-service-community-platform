package yamplatform.spscp.pojo;

import java.util.Date;

public class Notices {
    private Integer id;
    private String announcement;
    private String title;
    private Date newtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getNewtime() {
        return newtime;
    }

    public void setNewtime(Date newtime) {
        this.newtime = newtime;
    }

    @Override
    public String toString() {
        return "Announces{" +
                "id=" + id +
                ", announcement='" + announcement + '\'' +
                ", title='" + title + '\'' +
                ", newtime=" + newtime +
                '}';
    }
}
