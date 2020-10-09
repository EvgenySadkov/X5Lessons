package Lesson5.Task2;

public class FacadePC {
    public CPU cpu = new CPU();
    public RAM ram = new RAM();
    public GC gc = new GC();
    public HDD hdd = new HDD();
    public Monitor monitor = new Monitor();

    public void createPC() {
        cpu.output();
        ram.output();
        gc.output();
        hdd.output();
        monitor.output();
    }
}
