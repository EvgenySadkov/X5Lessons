package X5.Lesson3.Task2;

public class Cat extends Animal {
    String animal, name;
    int age;

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise(String animal) {
        System.out.println(animal + " урчит.");
    }

    @Override
    public void eat(String animal) {
        System.out.println(animal + " ест " + food);
    }
}
