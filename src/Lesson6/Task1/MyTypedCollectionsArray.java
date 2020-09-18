package Lesson6.Task1;

import java.util.Arrays;

public class MyTypedCollectionsArray<E> {
    private Object[] data = new Object[0];

    public int size() {
        return data.length;
    }

    public void add(E item) {
        Object[] result = new Object[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[i];
        }
        result[data.length] = item;
        data = result;
    }

    public void remove(int index) {
        Object[] result = new Object[data.length - 1];
        for (int i = 0; i < index - 1; i++) {
            result[i] = data[i];
        }
        for (int i = index; i < data.length; i++) {
            result[i - 1] = data[i];
        }
        data = result;
    }

    public void remove(E item) {
        for (int i = 0; i < data.length; i++) {
            if (item == data[i]) {
                remove(i + 1);
            }
        }
    }

    public E get(int index) {
        return (E) data[index];

    }

    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }
}
