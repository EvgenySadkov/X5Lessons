package X5.Lesson4.Task1;

public class Triangle implements Shape {
    @Override
    public double square(int sh) {
        double s = sh * sh / 2;
        return s;
    }
}
