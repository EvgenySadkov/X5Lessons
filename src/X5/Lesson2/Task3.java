package X5.Lesson2;

import java.util.Scanner;

public class Task3 {
    /*Ввести целое число в консоли. Если оно является
 положительным, то прибавить к нему 1, в противном
 случае не изменять его. Вывести полученное число.*/
    public static void main(String[] args) {
        System.out.print("Введите целое число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            a++;
        }
        System.out.println(a);
    }
}
