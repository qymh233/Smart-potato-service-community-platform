package yamplatform.spscp.pojo;

import java.util.Date;

public class Collects {
    //收藏类
    private Integer id;
    private Integer tid;
    private Integer uid;
    private Date ctime;
    private String tname;
    private String uname;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "Collects{" +
                "id=" + id +
                ", tid=" + tid +
                ", uid=" + uid +
                ", ctime=" + ctime +
                '}';
    }
}
