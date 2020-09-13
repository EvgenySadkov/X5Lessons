package X5.Lesson3.Task2;

public class Dog extends Animal {
    private String animal, name;
    private int age;

    public void setDog(String animal, String name, int age) {
        this.animal = animal;
        this.name = name;
        this.age = age;
    }

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
