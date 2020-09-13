package yamplatform.spscp.pojo;

import java.util.Date;

public class PhotoLibrarys {
    //图片库
    private Integer id;
    private String title;//标题
    private String url;//地址
    private Integer conDownload=0;//下载次数
    private Date uptime;//上传时间
    private String described;//描述
    private Integer uid;//用户id;

    private Users user;//上传者；

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getConDownload() {
        return conDownload;
    }

    public void setConDownload(Integer conDownload) {
        this.conDownload = conDownload;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public String getDescribed() {
        return described;
    }

    public void setDescribed(String described) {
        this.described = described;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PhotoLibrarys{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", conDownload=" + conDownload +
                ", uptime=" + uptime +
                ", described='" + described + '\'' +
                ", uid=" + uid +
                ", user=" + user +
                '}';
    }
}
