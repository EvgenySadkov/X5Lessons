package Lesson3.Task3;

public class Aspirant extends Student {
    private boolean work;

    public boolean isWork() {
        return work;
    }

    public Aspirant(String firstName, String lastName, String gruop, double averageMark) {
        super(firstName, lastName, gruop, averageMark);
        work = true;
    }

    @Override
    public void getScholarship() {
        if (getAverageMark() == 5) {
            System.out.println(getFirstName() + " стипендия " + 200);
        } else {
            System.out.println(getFirstName() + " стипендия " + 180);
        }
    }

    public void noWork() {
        if (work == true) {
            work = false;
        } else {
            work = true;
        }
    }

}
