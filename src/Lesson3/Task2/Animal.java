package Lesson3.Task2;

public class Animal {
    protected String food, location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(String animal) {
        System.out.println(animal + " спит.");
    }

    public void eat(String animal) {
        System.out.println(animal + " ест " + food);
    }

    public void sleep(String animal) {
        System.out.println(animal + " спит в " + location);

    }
}
