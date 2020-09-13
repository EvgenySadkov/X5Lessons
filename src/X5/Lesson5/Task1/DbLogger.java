package X5.Lesson5.Task1;

public class DbLogger extends Logger {
    @Override
    public Input log(String message) {
        return new DataBase();
    }
}
