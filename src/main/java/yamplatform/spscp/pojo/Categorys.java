package yamplatform.spscp.pojo;

import java.util.HashSet;
import java.util.Set;

public class Categorys {
    private int id;
    private String name;
    private int countTopics = 0;
    private int countComments = 0;
    private Set<Types> categoryTypes = new HashSet<Types>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountTopics() {
        return countTopics;
    }

    public void setCountTopics(int countTopics) {
        this.countTopics = countTopics;
    }

    public int getCountComments() {
        return countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }

    public Set<Types> getCategoryTypes() {
        return categoryTypes;
    }

    public void setCategoryTypes(Set<Types> categoryTypes) {
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
