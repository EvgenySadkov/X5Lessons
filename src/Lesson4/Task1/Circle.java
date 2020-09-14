package Lesson4.Task1;

public class Circle implements Shape {
    @Override
    public double square(int sh) {
        double s = Math.pow(sh / 2,2) * Math.PI;
        return s;
    }
}
