package Lesson3.Task2;

public class Horse extends Animal {
    private String animal, name;
    private int age;

    public void setHorse(String animal, String name, int age) {
        this.animal = animal;
        this.name = name;
        this.age = age;
    }

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
