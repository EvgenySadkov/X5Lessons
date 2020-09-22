package Lesson4.Task1;

public class Triangle implements Shape {
    private int sh;

    public void setSh(int sh) {
        this.sh = sh;
    }

    @Override
    public double square() {
        double s = sh * sh / 2;
        return s;
    }
}
