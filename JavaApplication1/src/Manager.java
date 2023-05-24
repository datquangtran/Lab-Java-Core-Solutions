/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Manager {

    private static String hexaString = "0123456789ABCDEF";
    private final static String BINARY_FORM = "[0-1]+";
    private final static String DECIMAL_FORM = "[0-9]+";
    private final static String HEXADECIMAL_FORM = "[0-9a-zA-Z]+";

    public static int inputChoiceMenu() {
        System.out.println("1. Convert from Binary");
        System.out.println("2. Convert from Decimal");
        System.out.println("3. Convert from Hexa");
        System.out.println("4. Exit");
        int choice = Validate.checkInputLimit(1, 4);
        return choice;
    }

    public static int inputChoiceConvert(String fromTo, String toCase1, String toCase2) {
        System.out.println("1. Convert from " + fromTo + " to " + toCase1);
        System.out.println("2. Convert from " + fromTo + " to " + toCase2);
        int choice = Validate.checkInputLimit(1, 2);
        return choice;
    }

    public static void ConvertFromBinary() {
        int choice = inputChoiceConvert("Binary", "Decimal", "Hexadecimal");
        String binary = Validate.checkInputBase("You only include 0 and 1", "binary", BINARY_FORM);
        switch (choice) {
            case 1:
                System.out.println("Decimal: " + otherToDec(binary, 2));
                break;
            case 2:
                System.out.println("Hexa: " + DecToOther(otherToDec(binary, 2), 16));
                break;
        }
    }

    public static void ConvertFromDecimal() {
        int choice = inputChoiceConvert("Decimal", "Binary","Hexadecimal");
        String mess = "You only include 0-9 or A-F or a-f";
        String decimal = Validate.checkInputBase(mess, "Decimal", DECIMAL_FORM);
        switch (choice) {
            case 1:
                System.out.println("Binary: " + DecToOther(Integer.parseInt(decimal), 2));
            case 2:
                System.out.println("Hexa: " + DecToOther(Integer.parseInt(decimal), 16));
                break;
        }
    }

    public static void ConvertFromHexa() {
        int choice = inputChoiceConvert("Hexadecimal", "Decimal", "Binary");
        String mess = "You only include 0-9 or A-F or a-f";
        String hexa = Validate.checkInputBase(mess, "Hexadecimal", HEXADECIMAL_FORM);
        switch (choice) {
            case 1:
                System.out.println("Decimal: " + otherToDec(hexa, 16));
                break;
            case 2:
                System.out.println("Binary: " + DecToOther(otherToDec(hexa, 16), 2));
                break;
        }
    }

    public static int otherToDec(String other, int base) {
        int dec = 0;
        for (int i = 0; i < other.length(); i++) {
            dec += hexaString.indexOf(other.charAt(i)) * Math.pow(base, other.length() - i - 1);
        }
        return dec;
    }

    public static String DecToOther(int dec, int base) {
        String result = "";
        while (dec != 0) {
            result = hexaString.charAt(dec % base) + result;
            dec /= base;
        }
        return result;
    }
}
// 1010 = 1. 2^3 + 0 2^2+ 1 2^1 + 0 2^0=11
//2A= 2. 16^1 + 10. 16^0

//