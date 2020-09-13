package X5.Lesson2;

import java.util.Scanner;

public class Task1 {
    /*Ввести целое число в консоли и вывести на экран
   последнюю цифру введенного числа.*/
    public static void main(String[] args) {
        System.out.print("Введите целое число:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Последняя цифра введенного числа " + input % 10);
    }
}
