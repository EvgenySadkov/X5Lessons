package Lesson5.Task2;

public class Monitor extends PC implements ComponentsPC {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "name='" + name + '\'' +
                '}';
    }

    public void output() {
        System.out.println(toString());
    }
}
