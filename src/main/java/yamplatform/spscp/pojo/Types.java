package yamplatform.spscp.pojo;

import java.util.HashSet;
import java.util.Set;

public class Types {
    private Integer id;
    private String name;
    private Integer countTopics = 0;
    private Integer countComments = 0;
    private Integer typescategoryid;
    private String url;

    private Categorys typesCategory;

    private Set<Topics> typeTopics = new HashSet<Topics>();

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

    public Integer getCountTopics() {
        return countTopics;
    }

    public void setCountTopics(Integer countTopics) {
        this.countTopics = countTopics;
    }

    public Integer getCountComments() {
        return countComments;
    }

    public void setCountComments(Integer countComments) {
        this.countComments = countComments;
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

    public Set<Topics> getTypeTopics() {
        return typeTopics;
    }

    public void setTypeTopics(Set<Topics> typeTopics) {
        this.typeTopics = typeTopics;
    }

    @Override
    public String toString() {
        return "Types{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countTopics=" + countTopics +
                ", countComments=" + countComments +
                ", typescategoryid=" + typescategoryid +
                ", url='" + url + '\'' +
                ", typesCategory=" + typesCategory +
                ", typeTopics=" + typeTopics +
                '}';
    }
}
