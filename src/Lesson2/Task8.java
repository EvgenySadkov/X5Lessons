package Lesson2;

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
        int maximumValue = arr[0];
        int sumOfPpositiveElements = 0;
        int sumOfEvenNegativeElements = 0;
        int numberOfPositiveElements = 0;
        double arithmeticMeanOfNegativeElements = 0;
        int numberOfElements = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximumValue) {
                maximumValue = arr[i];
            }
            if (arr[i] > 0) {
                sumOfPpositiveElements = sumOfPpositiveElements + arr[i];
            }
            if ((arr[i] < 0) & (arr[i] % 2 == 0)) {
                sumOfEvenNegativeElements = sumOfEvenNegativeElements + arr[i];
            }
            if (arr[i] > 0) {
                numberOfPositiveElements++;
            }
            if (arr[i] < 0) {
                arithmeticMeanOfNegativeElements = arithmeticMeanOfNegativeElements + arr[i];
                numberOfElements++;
            }
        }
        System.out.println("максимальное значение: " + maximumValue);
        System.out.println("сумма положительных элементов: " + sumOfPpositiveElements);
        System.out.println("сумму четных отрицательных элементов: " + sumOfEvenNegativeElements);
        System.out.println("количество положительных элементов: " + numberOfPositiveElements);
        double number = (arithmeticMeanOfNegativeElements / numberOfElements);
        System.out.println("среднее арифметическое отрицательных элементов: " + number);
    }
}
