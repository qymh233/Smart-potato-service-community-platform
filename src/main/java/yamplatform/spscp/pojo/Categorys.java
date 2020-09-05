package yamplatform.spscp.pojo;


import java.util.ArrayList;
import java.util.List;

public class Categorys {
    private Integer id;
    private String name;
    private Integer countTopics = 0;
    private Integer countComments = 0;


    private List<Types> categoryTypes;

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

    public List<Types> getCategoryTypes() {
        return categoryTypes;
    }

    public void setCategoryTypes(List<Types> categoryTypes) {
        this.categoryTypes = categoryTypes;
    }

    @Override
    public String toString() {
        return "Categorys{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countTopics=" + countTopics +
                ", countComments=" + countComments +
                ", categoryTypes=" + categoryTypes +
                '}';
    }
}
