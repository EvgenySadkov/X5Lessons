package Lesson4.Task1;

import java.util.Scanner;

public class Triangle implements Shape {
    private int side, height;

    @Override
    public double square() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину стороны треугольника:");
        side = Integer.valueOf(sc.nextLine());
        System.out.println("Введите длину высоты треугольника:");
        height = Integer.valueOf(sc.nextLine());
        return (side*height);
    }
}
