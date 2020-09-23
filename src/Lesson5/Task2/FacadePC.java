package Lesson5.Task2;

public class FacadePC {
    private CPU cpu = new CPU();
    private RAM ram = new RAM();
    private GC gc = new GC();
    private HDD hdd = new HDD();
    private Monitor monitor = new Monitor();

    public void createPC() {
        cpu.output();
        ram.output();
        gc.output();
        hdd.output();
        monitor.output();
    }
}
