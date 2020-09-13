package X5.Lesson2;

import java.util.Scanner;

public class Task2 {
    /*Ввести целое трехзначное число в консоли и найти
    сумму цифр этого трехзначного числа*/
    public static void main(String[] args) {
        System.out.print("Введите целое трехзначное число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < 4; i++) {
            sum = sum + a % 10;
            a = a / 10;
        }

        System.out.println("Сумма цифр " + sum);
    }
}
