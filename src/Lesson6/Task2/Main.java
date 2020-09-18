package Lesson6.Task2;

public class Main {
    public static void main(String[] args) {
        Apple<Integer> app1 = new Apple<>(1);
        Apple<Integer> app2 = new Apple<>(2);
        Orange<Integer> or1 = new Orange<>(1);
        Orange<Integer> or2 = new Orange<>(2);
        Box box1 = new Box<>();
        box1.add(app1);
        box1.add(app2);
        box1.add(or2);//не должен войти
        Box box2 = new Box<>();
        box2.add(or1);
        box2.add(or2);
        box1.print();
        box2.print();
    }
}
