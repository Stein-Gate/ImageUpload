package single.cherry.imageupdate.entity;

/**
 * @Author: Cherry
 * @Date: 2018/11/27 9:19
 */
public class User {
    private int id;
    private String name;
    private String pass;
    private String content;
    private Company company;

    public User() {
    }

    public User(String name, String pass, String content, Company company) {
        this.name = name;
        this.pass = pass;
        this.content = content;
        this.company = company;
    }

    public User(int id, String name, String pass, String content, Company company) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.content = content;
        this.company = company;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
