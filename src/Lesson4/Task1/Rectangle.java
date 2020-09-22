package Lesson4.Task1;

public class Rectangle implements Shape {
    private int sh;

    public void setSh(int sh) {
        this.sh = sh;
    }

    @Override
    public double square() {
        sh = sh * sh;
        return sh;
    }
}
