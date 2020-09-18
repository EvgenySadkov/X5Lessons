package Lesson6.Task2;

public class Main {
    public static void main(String[] args) {
        Apple<Integer> app1 = new Apple<>(1);
        Apple<Integer> app2 = new Apple<>(2);
        Orange<Integer> or1 = new Orange<>(1);
        Orange<Integer> or2 = new Orange<>(2);
        Orange<Integer> or3 = new Orange<>(3);
        Box box1 = new Box<>();
        box1.add(app1);
        box1.add(app2);
        box1.add(or2);//не должен войти
        Box box2 = new Box<>();
        box2.add(or1);
        box2.add(or2);
        Box box3 = new Box();
        box3.add(or3);
        box3.add(or1);
        box1.print();
        box2.print();
        box3.print();
        System.out.println("Вес коробки:" + box1.getClass()+ " " + box1.getWeight());
        System.out.println("Вес коробки:" + box2.getClass()+ " " + box2.getWeight());
        System.out.println(box1.compare(box2));
        box2.sprinkle(box3);//в первую коробку не идет
        box1.print();
        box2.print();
        box3.print();
    }
}
