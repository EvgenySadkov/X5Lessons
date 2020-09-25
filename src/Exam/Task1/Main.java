package Exam.Task1;

public class Main {

    public static void main(String[] args) { //Program arguments установлен 3600
        int second;
        System.out.println("Перевод секунд в минуты и часы");
        try { //Проверка на ошибки и вывод ее на экран.
            second = Integer.parseInt(args[0].trim());
            convert(second); //в случае отсутствия ошибок выполняем метод convert
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: " + e + " Не могу преобразовать " + args[0] + " в число.");
            System.exit(0);
        }
    }

    public static void convert(Integer second){ //перевод секунд в часы и минуты
        int hour, minut;
        hour = second / 3600;
        System.out.print(hour + " ");
        if ((hour > 10) & (hour < 15))
            System.out.print("часов"); //что то не так с окончанием в этом периоде, нужно отдельное условие
        else if ((hour % 10 == 0) | (hour % 10 >= 5))
            System.out.print("часов");
        else if (hour % 10 == 1)
            System.out.print("час");
        else if ((hour % 10 >= 2) & (hour % 10 <= 4))
            System.out.print("часа");
        System.out.print(" ");

        minut = ((second / 60) % 60);
        System.out.print(minut + " ");
        if ((minut > 10) & (minut < 15))
            System.out.print("минут");
        else if ((minut % 10 == 0) | (minut % 10 >= 5))
            System.out.print("минут");
        else if (minut % 10 == 1)
            System.out.print("минута");
        else if ((minut % 10 >= 2) & (minut % 10 <= 4))
            System.out.print("минуты");
    }
}