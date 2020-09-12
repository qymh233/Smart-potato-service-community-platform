package yamplatform.spscp.pojo;

import java.util.HashSet;
import java.util.Set;

public class Types {
    //知识专栏字栏目
    private Integer id;
    private String name;//名称
    private String content;//内容
    private Integer typescategoryid;//父标题
    private String url;//链接

    private Categorys typesCategory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Categorys getTypesCategory() {
        return typesCategory;
    }

    public void setTypesCategory(Categorys typesCategory) {
        this.typesCategory = typesCategory;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getTypescategoryid() {
        return typescategoryid;
    }

    public void setTypescategoryid(Integer typescategoryid) {
        this.typescategoryid = typescategoryid;
    }


    @Override
    public String toString() {
        return "Types{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", typescategoryid=" + typescategoryid +
                ", url='" + url + '\'' +
                ", typesCategory=" + typesCategory +
                '}';
    }
}
