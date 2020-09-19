package Lesson7.Exception;

public class UnknownAccountException extends Exception {
    public UnknownAccountException(String message) {
        super(message);
    }
}
