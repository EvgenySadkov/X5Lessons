package Lesson4.Task1;

public class Circle implements Shape {
    private int sh;

    public void setSh(int sh) {
        this.sh = sh;
    }

    @Override
    public double square() {
        double s = Math.pow(sh / 2, 2) * Math.PI;
        return s;
    }
}
