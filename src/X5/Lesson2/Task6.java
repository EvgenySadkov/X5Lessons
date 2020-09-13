package X5.Lesson2;

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
        String otv = "";
        if (obj == 0) {
            otv = otv + "нулевое ";
        } else {
            if (obj > 0) {
                otv = otv + "положительное ";
            } else {
                otv = otv + "отрицательное ";
            }
            if (obj % 2 == 0) {
                otv = otv + "четное ";
            } else {
                otv = otv + "нечетное ";
            }
        }
        System.out.println(otv + "число");

    }
}
