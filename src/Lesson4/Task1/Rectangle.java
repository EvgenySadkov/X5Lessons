package Lesson4.Task1;

import java.util.Scanner;

public class Rectangle implements Shape {
    private int side1, side2;

    @Override
    public double square() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину стороны 1:");
        side1 = Integer.valueOf(sc.nextLine());
        System.out.println("Введите длину стороны 2:");
        side2 = Integer.valueOf(sc.nextLine());
        return (side1*side2);
    }
}
