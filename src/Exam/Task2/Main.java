package Exam.Task2;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        String op = "";
                do { //организуем бесконечный цикл до ввода слова exit
            System.out.println("Введите выражение и нажмите [Enter]: ");
            String input = sc.nextLine();//считываем строку с консоли и записываем в переменную input
            //System.out.println(input);
                    try {//начинаем отсюда. чтобы в случае ошибки программа не переставала работать.

                if (input.equals("exit")) {//проверяем условие на выход
                System.out.println("До свидания!");
                break;
            }
            input = input.replaceAll("\\s+","");//удаляем лишние пробелы
            //System.out.println("input ="+input);

            String[] strings = input.split("\\W",2);//вносим в массив строк strings числа. без этого ругается что массив не инициализирован

             int c = input.indexOf('+'); //ищем оператор +. если находим, переносим числа в массив
            if (c>-1){
                   strings = input.split("\\+",2); //не работает без \\
                   op="+";
                }

            c = input.indexOf('-');
            if (c>-1){
                        strings = input.split("-",2);
                    op="-";
                    }

            c = input.indexOf('*');
            if (c>-1){
                        strings = input.split("\\*",2);//не работает без \\
                    op="*";
                    }

            c = input.indexOf('/');
            if (c>-1){
                strings = input.split("/",2);
                op="/";
                    }

                a = Double.parseDouble(strings[0]);//выделяем числа из массива
            //System.out.println("a= "+a);
                b = Double.parseDouble(strings[1]);//выделяем числа из массива
             //System.out.println("b= "+b);


                    System.out.println("Ответ: " + operation(a, b, op)); //выводим ответ расчета метода operation

                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e +"Повторите ввод."); //выводим код ошибки при наличии
                    }
        } while (true);
    }

    private static double operation(double a, double b, String op) { // метод расчета
        switch (op) {
            case "*":
                return a * b;
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            default://если знаков операций не обнаружено выводим 0
                return 0;
        }
    }
}