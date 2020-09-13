package X5.Lesson2;

public class Task8 {
    /*Дан массив целых чисел:
           [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного
   массива найти и вывести на экран:
           - максимальное значение
- сумму положительных элементов
- сумму четных отрицательных элементов
- количество положительных элементов
- среднее арифметическое отрицательных элементов*/
    public static void main(String[] args) {
        int[] arr = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = arr[0];
        int sump = 0;
        int sumo = 0;
        int kolp = 0;
        double saoe = 0;
        int kol = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] > 0) {
                sump = sump + arr[i];
            }
            if ((arr[i] < 0) & (arr[i] % 2 == 0)) {
                sumo = sumo + arr[i];
            }
            if (arr[i] > 0) {
                kolp++;
            }
            if (arr[i] < 0) {
                saoe = saoe + arr[i];
                kol++;
            }
        }
        System.out.println("максимальное значение: " + max);
        System.out.println("сумма положительных элементов: " + sump);
        System.out.println("сумму четных отрицательных элементов: " + sumo);
        System.out.println("количество положительных элементов: " + kolp);
        double number = (saoe / kol);
        System.out.println("среднее арифметическое отрицательных элементов: " + number);
    }
}
