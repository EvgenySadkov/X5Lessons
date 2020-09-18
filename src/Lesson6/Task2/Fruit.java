package Lesson6.Task2;

import java.util.Arrays;

public class Fruit <T> {
    T nummFruit;
    private T nameFruit;
    private Object[] Fruit = new Object[0];

    public void print(){
        System.out.println(Arrays.toString(Fruit));
    }
}
