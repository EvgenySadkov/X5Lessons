package X5.Lesson4.Task1;

public class Main {

    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(); //задана высота = основанию
        shape[1] = new Circle(); //задан диаметр
        shape[2] = new Rectangle(); //задана сторона квадрата
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square(10));
        }
    }
}
