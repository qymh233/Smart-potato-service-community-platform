package yamplatform.spscp.pojo;
//轮播图
public class Carousels {
    Integer id;
    String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Carousel{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}
