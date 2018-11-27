package single.cherry.imageupdate.entity;

public class Image {
    private int id;
    private String name;
    private String time;

    public Image() {
    }

    public Image(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Image(int id, String name, String time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

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
}
