package X5.Lesson3.Task2;

public class Horse extends Animal {
    String animal, name;
    int age;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise(String animal) {
        System.out.println(animal + " спит стоя.");
    }

    @Override
    public void eat(String animal) {
        System.out.println(animal + " ест " + food);
    }
}
