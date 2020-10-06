package Lesson4.Task1;

import java.util.Scanner;

public class Circle implements Shape {
    private int radius;

    @Override
    public double square() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус круга:");
        radius = Integer.valueOf(sc.nextLine());
        double s = ((radius*radius) * Math.PI);
        return s;
    }
}
