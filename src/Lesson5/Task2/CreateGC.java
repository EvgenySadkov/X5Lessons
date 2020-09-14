package Lesson5.Task2;

public class CreateGC implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new GC();
    }
}
