package X5.Lesson4.Task2;

public abstract class Car {
    //3. Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, мотор типа Engine.
    // Абстрактные методы start(), stop(), и реализованные методы turnRight(), turnLeft()

    String brand;
    int klass, weight;
    Engine engine;

    abstract void start();

    abstract void stop();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    abstract void printInfo();
}
