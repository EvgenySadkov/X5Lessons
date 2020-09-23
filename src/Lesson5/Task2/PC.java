package Lesson5.Task2;

import java.util.Scanner;

public class PC implements PCinterface {
    public static void main(String[] args) {


        Strategy cpu1 = new Strategy(); //создание компонентов через паттерн Стратегия
        cpu1.setComponentsPC(new CPU(1000, 2, 1024, "3m", "acer"));
        cpu1.createComponent();
        cpu1.setComponentsPC(new HDD("China", 500, TypeHDD.HDD, FormFactorHDD.LFF));
        cpu1.createComponent();
        System.out.println("");

        FacadePC comp1 = new FacadePC(); //создание полностью PC методом Фасад
        comp1.createPC();

        System.out.println("\n Вводите компонент для PC, который нужно создать:"); //создание компонента методом Factory
        Scanner sc = new Scanner(System.in);
        String component = sc.nextLine();
        FactoryComponents createprogram = null;
        switch (component) {
            case "CPU":
                createprogram = new CreateCPU();
                break;
            case "RAM":
                createprogram = new CreateRAM();
                break;
            case "GC":
                createprogram = new CreateGC();
                break;
            case "HDD":
                createprogram = new CreateHDD();
                break;
            case "Monitor":
                createprogram = new CreateMonitor();
                break;
            default:
                System.out.println("Компонент не найден");
        }
        if (createprogram != null) {
            ComponentsPC message = createprogram.createComponent();
            message.output();
        }

    }
}
