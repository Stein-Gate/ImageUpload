package single.cherry.imageupdate.entity;

/**
 * 机器种类
 * @Author: Cherry
 * @Date: 2018/11/27 16:09
 */
public class MachineType {
    private int id;
    private String name;
    private double length;
    private double width;
    private double height;
    private double weight;

    public MachineType() {
    }

    public MachineType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public MachineType(int id, String name, double length, double width, double height, double weight) {
        this.id = id;
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
