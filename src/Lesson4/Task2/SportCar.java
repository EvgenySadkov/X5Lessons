package Lesson4.Task2;

public class SportCar extends Car {
    private int drive;

    public SportCar(String brand, int klass, int weight, Engine engine,int drive) {
        this.brand = brand;
        this.klass = klass;
        this.weight = weight;
        this.engine = engine;
        this.drive = drive;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(brand + " " + klass + " " + weight + " " + drive + " " + engine);
    }
}