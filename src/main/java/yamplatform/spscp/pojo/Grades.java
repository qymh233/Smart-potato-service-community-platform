package yamplatform.spscp.pojo;

public class Grades {
    private int id;
    private String honor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "id=" + id +
                ", honor='" + honor + '\'' +
                '}';
    }
}
