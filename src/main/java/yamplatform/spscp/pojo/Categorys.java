package yamplatform.spscp.pojo;

import java.util.List;

public class Categorys {
    //知识专栏大标题
    private Integer id;
    private String name;


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
                ", categoryTypes=" + categoryTypes +
                '}';
    }
}
