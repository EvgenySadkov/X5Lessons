package X5.Lesson5.Task2;

public class Strategy {
    ComponentsPC componentsPC;

    public void setComponentsPC(ComponentsPC componentsPC) {
        this.componentsPC = componentsPC;
    }

    public void createComponent() {
        componentsPC.output();
    }
}
