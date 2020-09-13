package X5.Lesson3.Task2;

public class Cat extends Animal {
    public String animal, name;
    public int age;

    public void setCat(String animal, String name, int age) {
        this.animal = animal;
        this.name = name;
        this.age = age;
    }

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
