package Lesson6.Task2;

import java.util.Arrays;

public class Orange <T> extends Fruit{
    public Orange(T numFruit) {
    }
    private Object[] box = new Object[0];
@Override
    public void print (){
        System.out.println(Arrays.toString(box));
    }

}
