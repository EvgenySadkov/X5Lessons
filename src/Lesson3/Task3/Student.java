package Lesson3.Task3;

public class Student {
    private String firstName;
    private String lastName, gruop;
    private double averageMark;

    public Student(String firstName, String lastName, String gruop, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gruop = gruop;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void getScholarship() {
        if (averageMark == 5) {
            System.out.println(firstName + " стипендия " + 100);
        } else {
            System.out.println(firstName + " стипендия " + 80);
        }
    }
}

