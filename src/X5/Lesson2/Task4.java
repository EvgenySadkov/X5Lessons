package X5.Lesson2;

import java.util.Scanner;

public class Task4 {
     /*Ввести целое число в консоли. Если оно является
    положительным, то прибавить к нему 1; если
    отрицательным, то вычесть из него 2; если нулевым,
    то заменить его на 10. Вывести полученное число.*/

    public static void main(String[] args) {
        System.out.print("Введите целое число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            a = a + 1;
        }

        if (a < 0) {
            a = a - 2;
        }

        if (a == 0) {
            a = 10;
        }

        System.out.println(a);
    }
}
