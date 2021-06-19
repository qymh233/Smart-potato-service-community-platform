package yamplatform.spscp.pojo;

import java.util.Date;

public class News {
    private Integer id;
    private Integer tid;
    private Integer uid;
    private Date ntime;
    private String tname;
    private String uname;
    private Integer upid;

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

    public Date getNtime() {
        return ntime;
    }

    public void setNtime(Date ntime) {
        this.ntime = ntime;
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

    public Integer getUpid() {
        return upid;
    }

    public void setUpid(Integer upid) {
        this.upid = upid;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", tid=" + tid +
                ", uid=" + uid +
                ", ntime=" + ntime +
                ", tname='" + tname + '\'' +
                ", uname='" + uname + '\'' +
                ", upid=" + upid +
                '}';
    }
}
