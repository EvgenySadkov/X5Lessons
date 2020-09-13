package X5.Lesson4.Task2;

public class Lorry extends Car {
    private String brand;
    private int klass, weight;
    private Engine engine;
    private int lift;

    public Lorry(String brand, int klass, int weight, Engine engine, int lift) {
        this.brand = brand;
        this.klass = klass;
        this.weight = weight;
        this.engine = engine;
        this.lift = lift;
    }

    @Override
    void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    void printInfo() {
        System.out.println(brand + " " + klass + " " + weight + " " + lift + " " + engine);
    }
}
