package Lesson6.Task2;

import java.util.Arrays;

public class Box<T, E> {
    private Object[] box = new Object[0];

    public void add(T item) {
        if ((box.length == 0)) {
            Object[] result = new Object[box.length + 1];
            for (int i = 0; i < box.length; i++) {
                result[i] = box[i];
            }
            result[box.length] = item;
            box = result;
        } else {
            if ((item instanceof Orange) & (box[0] instanceof Orange) | (item instanceof Apple) & (box[0] instanceof Apple)) {
                Object[] result = new Object[box.length + 1];
                for (int i = 0; i < box.length; i++) {
                    result[i] = box[i];
                }
                result[box.length] = item;
                box = result;
            } else {
                System.out.println("разные фрукты");
            }
        }
    }

    public void print() {
        System.out.println(Arrays.toString(box));
    }

}
