package Lesson2;

import java.util.Scanner;

public class Task2 {
    /*Ввести целое трехзначное число в консоли и найти
    сумму цифр этого трехзначного числа*/
    public static void main(String[] args) {
        System.out.print("Введите целое трехзначное число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < 4; i++) {
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.println("Сумма цифр " + sum);
    }
}
