/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bo.TaskBo;
import mock.Data;
import util.Validation;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        Validation check = new Validation();
        TaskBo bo = new TaskBo(Data.list);
        while (true) {
            System.out.println("========Task Program======");
            System.out.println("1: Add Task");
            System.out.println("2: Delete task");
            System.out.println("3: Display task");
            System.out.println("4: Exit");
            int choice = check.getInt("Enter your choice:", 1, 4);
            switch (choice) {
                case 1:
                    if (bo.add()) {
                        System.out.println("Add Successfully");
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 2:
                    bo.delete();
                    break;
                case 3:
                    bo.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
