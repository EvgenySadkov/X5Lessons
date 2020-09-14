package Lesson2;

import java.util.Scanner;

public class Task7 {
       /*Написать программу, вычисляющую стоимость 10
минутного междугороднего разговора в зависимости
от кода города. ( Москва(905) - 4.15руб. Ростов(194) -
1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00
руб. ). Пользователь в консоли должен ввести код
города, а в ответ от программы получить, например,
при вводе кода 905, - «Москва. Стоимость разговора:
41.5»*/

    public static void main(String[] args) {
        System.out.print("Введите код города: ");
        Scanner sc = new Scanner(System.in);
        int kod = sc.nextInt();
        switch (kod) {
            case 904:
                System.out.println("Москва. Стоимость разговора: " + (4.15 * 10));
                break;
            case 194:
                System.out.println("Ростов. Стоимость разговора: " + (1.98 * 10));
                break;
            case 491:
                System.out.println("Краснодар. Стоимость разговора: " + (2.69 * 10));
                break;
            case 800:
                System.out.println("Киров. Стоимость разговора: " + (5.00 * 10));
                break;
            default:
                break;
        }

    }
}
