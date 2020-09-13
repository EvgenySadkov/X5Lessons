package X5.Lesson3.Task2;

public class Dog extends Animal {
    String animal, name;
    int age;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise(String animal) {
        System.out.println(animal + " лает.");
    }

    @Override
    public void eat(String animal) {
        System.out.println(animal + " ест " + food);
    }
}
