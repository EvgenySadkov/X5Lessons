package Lesson6.Task1;

import java.util.LinkedList;
import java.util.List;

public class MyTypedCollectionsLinkedList<E> {
    private List<E> data = new LinkedList<E>();

    public void print() {
        System.out.println(data);
    }

    public int size() {
        return data.size();
    }

    public void add(E item) {
        data.add(item);

    }

    public void remove(int index) {
        data.remove(index);
    }

    public void remove(E item) {
        data.remove(item);
    }

    public E get(int index) {
        return data.get(index);
    }

    void clear() {
        data.clear();
    }

}
