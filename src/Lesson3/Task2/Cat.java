package Lesson3.Task2;

public class Cat extends Animal {
    public String animal, name;
    public int age;

    public Cat(String food, String location, String animal, String name, int age) {
        super(food, location);
        this.animal = animal;
        this.name = name;
        this.age = age;
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
