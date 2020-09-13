package X5.Lesson3.Task3;

public class Main {

    public static void main(String[] args) {
        Aspirant student1 = new Aspirant("Petr", "Petrov", "ENG", 1);//второе задание в задаче создать отддельно.
        Student student = student1;
        Student arr[] = new Student[4];
        arr[0] = new Aspirant("Evgeny", "Sadkov", "IT", 5);
        arr[1] = new Student("Ivan", "Ivanov", "RUS", 4);
        arr[2] = new Student("Kolya", "Kolev", "RUS", 5);
        arr[3] = new Aspirant("Vasya", "Vasev", "IT", 3);
        for (int i = 0; i < arr.length; i++) {
            arr[i].getScholarship();
        }
        student1.noWork();
        System.out.println(student1.isWork());
    }
}
