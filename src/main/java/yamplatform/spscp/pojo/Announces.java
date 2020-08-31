package yamplatform.spscp.pojo;

import java.util.Date;

public class Announces {
    private Integer id;
    private String announcement;
    private String title;
    private Date thetime;

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

    public Date getThetime() {
        return thetime;
    }

    public void setThetime(Date thetime) {
        this.thetime = thetime;
    }

    @Override
    public String toString() {
        return "Announces{" +
                "id=" + id +
                ", announcement='" + announcement + '\'' +
                ", title='" + title + '\'' +
                ", thetime=" + thetime +
                '}';
    }
}
