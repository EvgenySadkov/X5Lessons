package X5.Lesson4.Task2;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setManufacturer("Двигатель");
        engine.setPower(150);
        Lorry gazon = new Lorry("GAZ", 1, 10000, engine, 100);
        gazon.start();
        gazon.printInfo();
        Car moskvich = new SportCar();
        moskvich.stop();
        moskvich.turnLeft();
    }
}
