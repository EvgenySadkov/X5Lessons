package X5.Lesson5.Task1;

public class ConsoleLogger extends Logger {
    @Override
    public Input log(String message) {
        return new Console();
    }
}
