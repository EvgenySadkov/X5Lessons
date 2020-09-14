package Lesson2;

import java.util.Scanner;

public class Task6 {
    /*Ввести целое число в консоли. Вывести его строку-
описание вида «отрицательное четное число»,
«нулевое число», «положительное нечетное число» и
т. д.*/

    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int obj = sc.nextInt();
        String str = "";
        if (obj == 0) {
            str = str + "нулевое ";
        } else {
            if (obj > 0) {
                str = str + "положительное ";
            } else {
                str = str + "отрицательное ";
            }
            if (obj % 2 == 0) {
                str = str + "четное ";
            } else {
                str = str + "нечетное ";
            }
        }
        System.out.println(str + "число");

    }
}
