package Lesson5.Task2;

public class HDD extends ComponentFactory implements ComponentsPC {
    private String manufacturer;
    private int size;
    private TypeHDD typeHDD;
    private FormFactorHDD formFactorHDD;

    public HDD() {
    }

    public HDD(String manufacturer, int size, TypeHDD typeHDD, FormFactorHDD formFactorHDD) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.typeHDD = typeHDD;
        this.formFactorHDD = formFactorHDD;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                ", typeHDD=" + typeHDD +
                ", formFactorHDD=" + formFactorHDD +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
