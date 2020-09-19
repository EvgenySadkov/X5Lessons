package Lesson7;

import Lesson7.Exception.NotEnoughMoneyException;
import Lesson7.Exception.UnknownAccountException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws UnknownAccountException, NotEnoughMoneyException, IOException {

        File file = new File("D:/AccountsBase.txt");//тут можно изменить путь к базе

        AccountService accountService = new AccountService(file);
        accountService.writeAccounts();//создать новую базу, если не существует
        //Account account = new Account(1, "Иванов Иван Иванович", 100);
        //accountService.recordAccountToBase(account);

        Scanner sc = new Scanner(System.in);
        System.out.println("Какую банковскую операцию хотите произвести: ");
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        switch (arr[0]) {
            case "balance":
                accountService.balance(Integer.valueOf(arr[1]));
                break;
            case "withdraw":
                accountService.withdraw(Integer.valueOf(arr[1]), Integer.valueOf(arr[2]));
                break;
            case "deposite":
                accountService.deposit(Integer.valueOf(arr[1]), Integer.valueOf(arr[2]));
                break;
            case "transfer":
                accountService.transfer(Integer.valueOf(arr[1]), Integer.valueOf(arr[2]), Integer.valueOf(arr[3]));
            default:
                System.out.println("Неизвестная операция");
                break;
        }
        accountService.printAll();
    }
}


