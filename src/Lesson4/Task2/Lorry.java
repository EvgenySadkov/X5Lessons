package Lesson4.Task2;

public class Lorry extends Car {

    private int lift;

    public Lorry(String brand, int klass, int weight, Engine engine, int lift) {
        this.brand = brand;
        this.klass = klass;
        this.weight = weight;
        this.engine = engine;
        this.lift = lift;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(brand + " " + klass + " " + weight + " " + lift + " " + engine);
    }
}
