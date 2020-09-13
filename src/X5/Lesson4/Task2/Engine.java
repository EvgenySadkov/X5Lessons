package X5.Lesson4.Task2;

public class Engine{
    private int power;
    private String manufacturer;

    public void setPower(int power) {
        this.power = power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
