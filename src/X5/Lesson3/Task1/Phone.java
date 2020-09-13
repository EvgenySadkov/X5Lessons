package X5.Lesson3.Task1;

public class Phone {

    private int number, weight;
    private String model;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {

        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {

        System.out.println("Звонит " + name + " с номера " + number);
    }

    public int getNumber() {
        return number;
    }

    public void sendMessage(int... number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
