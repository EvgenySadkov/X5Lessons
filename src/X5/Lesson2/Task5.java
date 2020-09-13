package X5.Lesson2;

import java.util.Scanner;

public class Task5 {
    /*Ввести три целых числа с консоли. Вывести на
    экран наименьшее из них.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите целое число " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < 3; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Наименьшее число: " + min);
    }
}
