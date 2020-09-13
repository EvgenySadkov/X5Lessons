package X5.Lesson5.Task1;

public class Calculator {


    public static void add(double a, double b, Logger logger) {
        if (logger != null) {

            Input exit = logger.log("");
            exit.createlog();
            System.out.println(" " + (a + b));
        }
    }

    public static void minus(double a, double b, Logger logger) {
        if (logger != null) {

            Input exit = logger.log("");
            exit.createlog();
            System.out.println(" " + (a - b));
        }
    }

    public static void multiplication(double a, double b, Logger logger) {
        if (logger != null) {

            Input exit = logger.log("");
            exit.createlog();
            System.out.println(" " + (a * b));
        }
    }

    public static void division(double a, double b, Logger logger) {
        if (logger != null) {

            Input exit = logger.log("");
            exit.createlog();
            System.out.println(" " + (a / b));
        }
    }
}
