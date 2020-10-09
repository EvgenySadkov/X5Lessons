package Lesson5.Task1;

public class Calculator {
    private String input, operand, message;
    private double tempA, tempB;

    public String getMessage() {
        return message;
    }

    public Calculator(String input) {
        this.input = input;
        try {
            input = input.replaceAll("\\s+", "");
            String[] strings = input.split("\\W", 2);
            int c = input.indexOf('+');
            if (c > -1) {
                strings = input.split("\\+", 2);
                operand = "+";
            }
            c = input.indexOf('-');
            if (c > -1) {
                strings = input.split("-", 2);
                operand = "-";
            }
            c = input.indexOf('*');
            if (c > -1) {
                strings = input.split("\\*", 2);//не работает без \\
                operand = "*";
            }
            c = input.indexOf('/');
            if (c > -1) {
                strings = input.split("/", 2);
                operand = "/";
            }
            tempA = Double.parseDouble(strings[0]);
            tempB = Double.parseDouble(strings[1]);


            switch (operand) {
                case "*":
                    message = Double.toString((tempA * tempB));
                    break;
                case "+":
                    message = Double.toString((tempA + tempB));

                    break;
                case "-":
                    message = Double.toString((tempA - tempB));

                    break;
                case "/":
                    message = Double.toString((tempA / tempB));

                    break;
                default:
            }

        } catch (
                Exception e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
