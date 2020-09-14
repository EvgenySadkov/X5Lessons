package Lesson2;

public class Task10 {
    /*Дан массив целых чисел:
[15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]. Переместить
нули в конец массива. Вывести результат в консоль*/
    public static void main(String[] args) {
        int[] arr = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
