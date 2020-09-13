package X5.Lesson4.Task2;

public class SportCar extends Car {
    @Override
    void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    void printInfo() {
        System.out.println(brand + klass + weight + engine);
    }
}