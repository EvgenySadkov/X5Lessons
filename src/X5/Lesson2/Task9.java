package X5.Lesson2;

public class Task9 {
    /*Дан массив целых чисел:
            [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].
    Переставить элементы массива в обратном порядке.
    Вывести результат в консоль*/
    public static void main(String[] args) {
        int[] arr = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[] arr2 = new int[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            j--;
            arr2[i] = arr[j];
        }
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");

    }
}
