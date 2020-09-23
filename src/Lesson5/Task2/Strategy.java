package Lesson5.Task2;

public class Strategy {
    private ComponentsPC componentsPC;

    public void setComponentsPC(ComponentsPC componentsPC) {
        this.componentsPC = componentsPC;
    }

    public void createComponent() {
        componentsPC.output();
    }
}
