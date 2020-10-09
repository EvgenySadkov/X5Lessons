package Lesson5.Task2;

public class PCFactory {
    private String component;


    public PCFactory(String component) {
        this.component = component;
    }

    public ComponentFactory getComponent() {
        switch (component) {
            case "CPU":
                return new CPU();
            case "RAM":
                return new RAM();
            case "GC":
                return new GC();
            case "HDD":
                return new HDD();
            case "Monitor":
                return new Monitor();
            default:
                return null;
        }
    }
}
