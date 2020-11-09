/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import bo.StudentBo;
import java.util.Scanner;
import mock.Data;

/**
 *
 * @author Admin
 */
public class Main {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        StudentBo st = new StudentBo(Data.list);
        System.out.println("------Management Student Program------");
        do {
            st.add();

        } while (m.choice());
        st.display();
        st.percentTypeStudent();
    }

    boolean choice() {
      
        System.out.println("Do you want to enter more student information?(Y/N)");
        while (true) {
            String check = scanner.nextLine();
            if (check.equalsIgnoreCase("Y")) {
                return true;
            } else if (check.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Invalid Pls Enter(Y/N)");
            }
        }
    }
}
