package entities;
public class Alturas {
    private String name;
    private int age;
    private double height;

    public Alturas(String name, int age, double height) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getAltura() {
        return height;
    }
    public void setAltura(double height) {
        this.height = height;
    }
}
