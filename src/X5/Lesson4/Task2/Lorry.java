package X5.Lesson4.Task2;

public class Lorry extends Car {

    public int lift;

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
