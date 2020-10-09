package Lesson4.Task1;

import java.util.Scanner;

public class Triangle implements Shape {
    private int side, height;

    @Override
    public double square() {

        return (side*height);
    }
}
