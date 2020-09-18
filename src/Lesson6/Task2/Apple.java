package Lesson6.Task2;

import java.util.Arrays;

public class Apple<T> extends Fruit {
    private Object[] box = new Object[0];

    public Apple(T numFruit) {
                }
                @Override
    public void print (){
        System.out.println(Arrays.toString(box));
    }
}
