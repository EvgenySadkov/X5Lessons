package X5.Lesson5.Task2;

public class CreateRAM implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new RAM();
    }
}
