package Lesson5.Task2;

public class RAM extends ComponentFactory implements ComponentsPC {
    private String manufacturer;
    private int size;
    private int clockFrequency;
    private TypeRAM typeRAM;

    public RAM() {
    }

    public RAM(String manufacturer, int size, int clockFrequency, TypeRAM typeRAM) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.clockFrequency = clockFrequency;
        this.typeRAM = typeRAM;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                ", clockFrequency=" + clockFrequency +
                ", typeRAM=" + typeRAM +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
