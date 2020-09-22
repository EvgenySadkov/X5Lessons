package Lesson4.Task2;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(150,"Двигатель");
        Lorry gazLory = new Lorry("GAZ", 1, 10000, engine, 100);
        gazLory.start();
        gazLory.printInfo();
        Car moskvich = new SportCar("Ferrari", 1, 1000, engine, 220);
        moskvich.stop();
        moskvich.turnLeft();
    }
}
