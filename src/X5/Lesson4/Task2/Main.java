package X5.Lesson4.Task2;

public class Main {

    public static void main(String[] args) {
        Lorry gazon = new Lorry();
        gazon.start();
        gazon.klass = 1;
        gazon.brand = "Gaz";
        gazon.weight = 10000;
        gazon.lift = 100;
        gazon.engine.setPower(150);
        gazon.engine.setManufacturer("Двигатель");
        gazon.printInfo();
        Car moskvich = new SportCar();
        moskvich.stop();
        moskvich.turnLeft();
    }
}
