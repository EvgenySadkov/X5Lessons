package Lesson4.Task1;

public class Rectangle implements Shape {
    @Override
    public double square(int sh) {
        sh = sh * sh;
        return sh;
    }
}
