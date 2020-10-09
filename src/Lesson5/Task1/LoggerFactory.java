package Lesson5.Task1;

public class LoggerFactory {
    private String way;

    public LoggerFactory(String way) {
        this.way = way;
    }

    public Logger getLog() {
        LogType type = LogType.valueOf(way);
        switch (type) {
            case DB:
                return new DbLogger();
            case File:
                return new FileLogger();
            case Console:
                return new ConsoleLogger();
            default:
                return null;
        }

    }
}
