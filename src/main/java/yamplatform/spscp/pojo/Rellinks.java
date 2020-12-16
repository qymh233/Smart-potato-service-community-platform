package yamplatform.spscp.pojo;

public class Rellinks {
    //友情连接
    private Integer id;
    private String title;//题目
    private String url;//连接
    private String cont=null;//内容

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

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "Rellinks{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", cont='" + cont + '\'' +
                '}';
    }
}
