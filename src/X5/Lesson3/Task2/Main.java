package X5.Lesson3.Task2;

public class Main {

    public static void main(String[] args) {
        Animal[] arr = new Animal[3];
        arr[0] = new Cat("Wiskas", "Home");
        arr[1] = new Dog("Pedigri", "Budka");
        arr[2] = new Horse("Soloma", "Hlev");
        for (int i = 0; i < arr.length; i++) {
            Veterinar veterinar = new Veterinar();
            veterinar.treatAnimal(arr[i]);
        }
    }
}
