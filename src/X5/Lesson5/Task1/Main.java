package X5.Lesson5.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Калькулятор включен. Введите выражение:");
        double otvet = 0, a, b;
        String input = sc.nextLine();
        String op = "";

        try {
            input = input.replaceAll("\\s+", "");
            String[] strings = input.split("\\W", 2);
            int c = input.indexOf('+');
            if (c > -1) {
                strings = input.split("\\+", 2);
                op = "+";
            }
            c = input.indexOf('-');
            if (c > -1) {
                strings = input.split("-", 2);
                op = "-";
            }
            c = input.indexOf('*');
            if (c > -1) {
                strings = input.split("\\*", 2);//не работает без \\
                op = "*";
            }
            c = input.indexOf('/');
            if (c > -1) {
                strings = input.split("/", 2);
                op = "/";
            }
            a = Double.parseDouble(strings[0]);
            b = Double.parseDouble(strings[1]);

            System.out.println("Введите путь: ");
            WayType type = null;
            try {
                type = WayType.valueOf(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Не возможно сохранить " + e);
            }
            Logger logger = null;
            switch (type) {
                case DB:
                    logger = new DbLogger();
                    break;
                case File:
                    logger = new FileLogger();
                    break;
                case Console:
                    logger = new ConsoleLogger();
                    break;
                default:
            }

            switch (op) {
                case "*":
                    Calculator.multiplication(a, b, logger);
                    break;
                case "+":
                    Calculator.add(a, b, logger);

                    break;
                case "-":
                    Calculator.minus(a, b, logger);

                    break;
                case "/":
                    Calculator.division(a, b, logger);

                    break;
                default:
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }

    }

}

