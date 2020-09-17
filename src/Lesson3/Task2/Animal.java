package Lesson3.Task2;

public class Animal {
    protected String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
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
