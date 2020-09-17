package Lesson3.Task2;

public class Veterinar {
    public void treatAnimal(Animal animal) {
        System.out.print(animal.getClass().getSimpleName()+ " ест ");
        System.out.print(animal.getFood() + " и находится в ");
        System.out.println(animal.getLocation());
    }
}
