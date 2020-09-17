package Lesson5.Task2;

public class CPU extends PC implements ComponentsPC {
    private int clockFrequency;
    private int core;
    private int cacheMemory;
    private String name;
    private String manufacturer;

    public CPU() {
    }

    public CPU(int clockFrequency, int core, int cacheMemory, String name, String manufacturer) {
        this.clockFrequency = clockFrequency;
        this.core = core;
        this.cacheMemory = cacheMemory;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public void setCPU(int clockFrequency, int core, int cacheMemory, String name, String manufacturer) {
        this.clockFrequency = clockFrequency;
        this.core = core;
        this.cacheMemory = cacheMemory;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "clockFrequency=" + clockFrequency +
                ", core=" + core +
                ", cacheMemory=" + cacheMemory +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}

