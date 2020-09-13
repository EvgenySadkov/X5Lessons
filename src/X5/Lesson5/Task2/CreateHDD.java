package X5.Lesson5.Task2;

public class CreateHDD implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new HDD();
    }
}
