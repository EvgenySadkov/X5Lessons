package Lesson3.Task2;

public class Horse extends Animal {
    private String animal, name;
    private int age;

    public Horse(String food, String location, String animal, String name, int age) {
        super(food, location);
        this.animal = animal;
        this.name = name;
        this.age = age;
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
