/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Validation.Validate;
import bo.ExpenseBo;
import java.util.Scanner;
import mock.Data;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        ExpenseBo ex = new ExpenseBo(Data.list);
        Validate check = new Validate();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("--------Handy Expense program--------");
            System.out.println("1. Add an espense");
            System.out.println("2. Display all expense");
            System.out.println("3. Delete an expense");
            System.out.println("4. Quit");
            int choice = check.getInt("Enter the choice:", 1, 4);
            switch (choice) {
                case 1:
                    ex.add();
                    break;
                case 2:
                    ex.display();
                    break;
                case 3:
                    System.out.println("Enter the ID:");
                    int num = Integer.parseInt(scanner.nextLine());
                    if (ex.remove(num)) {
                        System.out.println("Remove successfully");
                    } else {
                        System.out.println("Not Found");
                    }
                    break;
                case 4:
                    flag = false;
            }
        } while (flag);

    }

}
