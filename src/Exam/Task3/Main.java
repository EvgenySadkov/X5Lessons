package Exam.Task3;

import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
          do {try { //проверка на ошибки.
              System.out.println("Введите N и R:");

                      int N,R;
           String NiR = sc.nextLine();//вводим числа в строку NiR


           String[] NiRmass = NiR.split(" ", 2);
           N = Integer.parseInt(NiRmass[0]);
           R = Integer.parseInt(NiRmass[1]);

           if ((N > 10) & (N < 15))
               System.out.print("Введите " + N + " точек подачи:"); //что то не так с окончанием в этом периоде, нужно отдельное условие
           else if ((N % 10 == 0) | (N % 10 >= 5))
               System.out.print("Введите " + N + " точек подачи:");
           else if (N % 10 == 1)
               System.out.print("Введите " + N + " точку подачи:");
           else if ((N % 10 >= 2) & (N % 10 <= 4))
               System.out.print("Введите " + N + " точки подачи:");

           String Tpod = sc.nextLine();//вводим точки подачи в строку Tpod
           String[] Tpodmass = Tpod.split(" ");
           int koord[] = new int[N];//создаем массив для координат и переносим из массива строк
           for (int i = 0; i < N; i++) {
               koord[i] = Integer.parseInt(Tpodmass[i]);
           }
           for (int i = koord.length - 1; i > 0; i--) { //сортируем массив координат по возрастанию, будем объединять точки прибытия в отрезки
               for (int j = 0; j < i; j++) {
                   if (koord[j] > koord[j + 1]) {
                       int tmp = koord[j];
                       koord[j] = koord[j + 1];
                       koord[j + 1] = tmp;
                   }
               }
           }

           int otv = 0;// переменная в которую запишем результат
           int tmp1, otr1; //tmp будет началом отрезка, otr1 концом
           tmp1 = koord[0];
           if ((koord[1] - tmp1) > (R)) {//нужно проверить, если первая точка одна в отрезке, ее сразу нужно добавить в счетчик.
               otv = otv + 1;}
           for (int i = 1; i < N; i++) {
               if ((koord[i] - tmp1) > (R)) {//проверка не одна в отрезке ли первая точка
                   tmp1 = koord[i];
                   otv = otv + 1;//если от точки расстояние больше R, +1 к счетчику и эту точку выставляем началом отрезка
                   } else {//если от точки до следующей расстояние меньше R, то отрезок будет в два раза больше
                   otr1 = tmp1 + 2 * R;
                   for (int j = i; j < N; j++)//в этом цикле собираем все точки в этот отрезок
                       if (koord[j] > otr1) {//вычисляем конец отрезка чтобы прибавить счетчик
                           i = j-1;
                           tmp1 = koord[i];
                           otv = otv + 1;
                           j=N;
                       }
               }
                        }
           System.out.println("Количество рекомендованных точек:");
           System.out.println(otv);
           break;
       } catch (Exception e) {
        System.out.println("Ошибка: " + e +"Повторите ввод."); //выводим код ошибки при наличии
    }
       } while (true);
               }}

