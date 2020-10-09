package Lesson5.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Strategy comp1 = new Strategy(); //создание компонентов через паттерн Стратегия
        comp1.setComponentsPC(new CPU(1000, 2, 1024, "3m", "acer"));
        comp1.createComponent();
        Strategy comp2 = new Strategy();
        comp2.setComponentsPC(new HDD("China", 500, TypeHDD.HDD, FormFactorHDD.LFF));
        comp2.createComponent();
        Strategy comp3 = new Strategy();
        comp3.setComponentsPC(new GC("Nvideo", TypeRAMGC.DDR,1000, CoolingGC.passive));
        comp3.createComponent();
        Strategy comp4 = new Strategy();
        comp4.setComponentsPC(new RAM("China", 1600, 1600, TypeRAM.DDR3));
        comp4.createComponent();
        Strategy comp5 = new Strategy();
        comp5.setComponentsPC(new Monitor("Samsung"));
        comp5.createComponent();
        System.out.println("");


        FacadePC pcNew = new FacadePC(); //создание полностью PC методом Фасад
        pcNew.createPC();

        System.out.println("\n Вводите компонент для PC, который нужно создать:"); //создание компонента методом Factory
        Scanner sc = new Scanner(System.in);
        String component = sc.nextLine();
        PCFactory createprogram = new PCFactory(component);
        if (createprogram != null) {
            createprogram.getComponent().output();
        }
        else{
            System.out.println("Компонент не найден");
        }

    }
}
