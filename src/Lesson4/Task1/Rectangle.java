package Lesson4.Task1;

import java.util.Scanner;

public class Rectangle implements Shape {
    private int side1, side2;

    @Override
    public double square() {
        return (side1*side2);
    }
}
