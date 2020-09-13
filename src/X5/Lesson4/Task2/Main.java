package X5.Lesson4.Task2;

public class Main {

    public static void main(String[] args) {
        Car gazon = new Lorry();
        gazon.start();
        gazon.printInfo();
        Car moskvich = new SportCar();
        moskvich.stop();
        moskvich.turnLeft();
    }
}
