package Lesson3.Task1;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone(12345, "call1", 1);
        Phone phone2 = new Phone(54321, "call1");
        Phone phone3 = new Phone();
        phone1.receiveCall("ring1");
        phone2.receiveCall("ring2");
        phone3.receiveCall("ring3");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        phone1.receiveCall("caller1", 122334);
        phone1.sendMessage(12345, 54367, 121212);
    }
}
