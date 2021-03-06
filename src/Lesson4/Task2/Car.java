package Lesson4.Task2;

public abstract class Car {
    //3. Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, мотор типа Engine.
    // Абстрактные методы start(), stop(), и реализованные методы turnRight(), turnLeft()

    protected String brand;
    protected int klass, weight;
    protected Engine engine;

    public abstract void start();

    public abstract void stop();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {System.out.println(brand + " " + klass + " " + weight  + " " + engine);
    }
}
