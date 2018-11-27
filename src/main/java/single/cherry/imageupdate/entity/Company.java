package single.cherry.imageupdate.entity;

/**
 * @Author: Cherry
 * @Date: 2018/11/27 9:19
 */
public class Company {
    private int id;
    private String name;
    private String pass;
    private String content;

    public Company() {
    }

    public Company(String name, String pass, String content) {
        this.name = name;
        this.pass = pass;
        this.content = content;
    }

    public Company(int id, String name, String pass, String content) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.content = content;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
