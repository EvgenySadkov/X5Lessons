package Lesson5.Task2;

public class GC extends ComponentFactory implements ComponentsPC {
    private String manufacturer;
    private TypeRAMGC typeRAMGC;
    private int size;
    private CoolingGC coolingGC;

    public GC() {
    }

    public GC(String manufacturer, TypeRAMGC typeRAMGC, int size, CoolingGC coolingGC) {
        this.manufacturer = manufacturer;
        this.typeRAMGC = typeRAMGC;
        this.size = size;
        this.coolingGC = coolingGC;
    }

    @Override
    public String toString() {
        return "GC{" +
                "manufacturer='" + manufacturer + '\'' +
                ", typeRAMGC=" + typeRAMGC +
                ", size=" + size +
                ", coolingGC=" + coolingGC +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
