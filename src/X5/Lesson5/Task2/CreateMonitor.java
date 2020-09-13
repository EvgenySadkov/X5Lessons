package X5.Lesson5.Task2;

public class CreateMonitor implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new Monitor();
    }
}
