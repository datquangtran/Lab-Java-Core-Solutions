/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011.GUI;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class validateInput {

    public static Scanner sc = new Scanner(System.in);

    private static boolean checkBigInt(String input) {
        String regex = "[0-9]+";
        return input.matches(regex);
    }

    //Enter a BigInteger number
    public static BigInteger inputBigInt(String msg) {
        BigInteger finalInput = null;
        do {
            System.out.print(msg);
            sc = new Scanner(System.in);
            String inputStr = sc.nextLine();
            if (!inputStr.isEmpty()) {
                try {
                    finalInput = new BigInteger(inputStr);
                    if (finalInput.compareTo(new BigInteger("0")) >= 0) {
                        return finalInput;
                    } else {
                        System.out.println("Number must be positive.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Only accept valid numbers.");
                }
            } else {
                System.out.println("Input must not be empty!");
            }
        } while (true);
    }

    //Enter an integer in [min - max]
    public static int inputInt(String msg, int min, int max) {
        int finalInput;
        do {
            System.out.print(msg);
            try {
                //Check validate
                String rawInput = sc.nextLine().trim();

                //If leave it blank
                if (!rawInput.isEmpty()) {
                    //("Input must not empty!");

                    //Parse to Integer
                    finalInput = Integer.parseInt(rawInput);

                    // Check if out of range
                    if (finalInput >= min && finalInput <= max) {
                        return finalInput;
                        //throw new NumberFormatException
                    } else {
                        System.out.println("Out of range. Input number must from " + min + " to " + max);;
                    }

                } else {
                    System.out.println("Input must not empty");
                }

            } catch (NumberFormatException e) {
                //If user enter an invalid number
                System.out.println("Only accept valid number.");
            }
        } while (true);

    }

    //Check if String hexa is a hexadecimal number or not
    public static boolean checkHexa(String hexa) {
        int i;
        for (i = 0; i < hexa.length(); ++i) {
            char ch = hexa.charAt(i);
            //HEX number contain (0 - 9) and (A - F). Accept only UPPERCASE character
            if ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F')) {
            } else {
                return false;
            }
        }
        return true;
    }

    //Enter a hexadecimal number stored in a string, with limitation of length
    public static String inputHexa(String msg, int limitation) {
        String hexaInput = "";
        do {
            System.out.print(msg);
            hexaInput = sc.nextLine().trim().toUpperCase();
            if (hexaInput.isEmpty()) {
                System.out.println("Input cannot be empty.");
            } else if (!checkHexa(hexaInput)) {
                System.out.println("Invalid hexadecimal input.");
            } else if (hexaInput.length() >= limitation) {
                System.out.println("Input is too big, enter again: ");
            } else {
                return hexaInput;
            }
        } while (true);
    }

//Check if String bin is correct to binary format
    public static boolean checkBin(String bin) {
        int i;
        for (i = 0; i < bin.length(); ++i) {
            //A binary number contains only 0 and 1
            if (bin.charAt(i) != '0' && bin.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    //Enter binary number with limitation of length
    public static String inputBin(String msg, int limitation) {
        String binaryInput = "";
        do {
            System.out.print(msg);
            binaryInput = sc.nextLine().trim();
            if (binaryInput.isEmpty()) {
                System.out.println("Input must not be empty!");
            } else if (!checkBin(binaryInput)) {
                System.out.println("Invalid binary input.");
            } else if (binaryInput.length() >= limitation) {
                System.out.println("Number is too large.");
            } else {
                return binaryInput;
            }
        } while (true);
    }
}
