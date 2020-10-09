package Lesson5.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Калькулятор включен. Введите выражение:");
        String input = sc.nextLine();
        Calculator calculator = new Calculator(input);
        System.out.println("Type logger: ");
        input = sc.nextLine();
        LoggerFactory logger = new LoggerFactory(input);
        logger.getLog().log(calculator.getMessage());


    }

}

