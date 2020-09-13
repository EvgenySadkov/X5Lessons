package X5.Lesson5.Task2;

public class CreateCPU implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new CPU();
    }
}
