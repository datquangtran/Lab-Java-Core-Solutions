/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import java.util.Scanner;

public class Validation {

    private Scanner scanner = new Scanner(System.in);

    public double getDouble(String mess, double min, double max) {
        System.out.println(mess);
        while (true) {

            try {
                double number = Double.parseDouble(scanner.nextLine());
                if (min < number && number <= max) {
                    return number;
                } else {
                    System.out.println("Out ragne!Pls retype:");
                }
            } catch (Exception e) {
                System.out.println("Invalid-Must is digit!Pls retype:");
            }
        }

    }

    public String getInput(String mess) {
        System.out.println(mess);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("Non emty string!Pls retype:");
            } else {
                return input;
            }
        }
    }
}
