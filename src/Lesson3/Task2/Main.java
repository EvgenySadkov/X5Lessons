package Lesson3.Task2;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Wiskas", "Дом","Перс", "Васька", 12);

        Dog dog = new Dog("Pedigri", "Будка", "Боксер", "Барбос", 2);

        Horse horse = new Horse("Солома", "Хлев", "Пони", "Поник", 13);

        cat.makeNoise(cat.animal);

        Animal[] arr = new Animal[3];
        arr[0] = cat;
        arr[1] = dog;
        arr[2] = horse;
        for (int i = 0; i < arr.length; i++) {
            Veterinar veterinar = new Veterinar();
            veterinar.treatAnimal(arr[i]);
        }
    }
}
