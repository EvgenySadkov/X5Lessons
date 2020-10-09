package Lesson5.Task1;

public class FileLogger extends Logger implements Input  {
    @Override
    public void log(String message) {
        System.out.print("Log into file: " + message);
    }

}