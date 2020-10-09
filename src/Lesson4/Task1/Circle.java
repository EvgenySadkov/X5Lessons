package Lesson4.Task1;

public class Circle implements Shape {
    private int radius;

    @Override
    public double square() {
         return (radius*radius*Math.PI);
    }
}
