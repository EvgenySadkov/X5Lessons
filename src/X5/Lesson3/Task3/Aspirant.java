package X5.Lesson3.Task3;

public class Aspirant extends Student {
    boolean rabota;

    public Aspirant(String firstName, String lastName, String gruop, double averageMark) {
        super(firstName, lastName, gruop, averageMark);
        rabota = true;
    }

    @Override
    public void getScholarship() {
        if (averageMark == 5) {
            System.out.println(firstName + " стипендия " + 200);
        } else {
            System.out.println(firstName + " стипендия " + 180);
        }
    }
}
