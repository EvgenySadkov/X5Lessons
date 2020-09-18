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

    public double getWeight() {
        double temp = 0;
        if (box.length == 0) {
            temp = 0;
        } else {
            if (box[0] instanceof Orange) {
                temp = (box.length * 1.5);
            } else {
                if (box[0] instanceof Apple) {
                    temp = (box.length * 1);
                }
            }

        }
        return temp;
    }

    public boolean compare(Box underBox) {

        return (this.getWeight() == underBox.getWeight());
    }

    public Object getFruit(int i) {
        return box[i];
    }

    public int getLength() {
        return box.length;
    }

    public void sprinkle(Box to) {//задание со *
        if ((box[0] instanceof Orange) & (to.getFruit(0) instanceof Orange) | (box[0] instanceof Apple) & (to.getFruit(0) instanceof Apple)) {
            Object[] result = new Object[box.length + to.getLength()];
               for (int i = 0; i < to.getLength(); i++) {
                result[i] = to.getFruit(i);
                      }
               for (int i= to.getLength(); i<box.length + to.getLength(); i++){
                   result[i]=box[i-to.getLength()];
               }
            box = result;
               to.clear();

        }
        else {
            System.out.println("Нельзя сыпать разные фрукты в одну коробку");
        }
    }

    private void clear() {
        for (int i=0; i<box.length; i++){
            box[i]=null;
        }
    }
}
