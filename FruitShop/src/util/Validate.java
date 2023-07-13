package util;

import java.util.Scanner;

public class Validate {

    private static Scanner scanner = new Scanner(System.in);

    private Validate() {
    }

    public static int getInt(String messageInfo, String messageError, int min, int max) {
        do {
            try {
                System.out.print(messageInfo);
                int number = Integer.parseInt(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println(messageError);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer number.");
            }
        } while (true);
    }

    public static float getFloat(String messageInfo, float min, float max) {
        do {
            try {
                System.out.print(messageInfo);
                float number = Float.parseFloat(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println("Numeric value out of range.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid float number.");
            }
        } while (true);
    }
    public static double getDouble(String messageInfo, double min, double max) {
        do {
            try {
                System.out.print(messageInfo);
                double number = Double.parseDouble(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println("Numeric value out of range.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid float number.");
            }
        } while (true);
    }

    public static String getString(String messageInfo, String messageError, final String REGEX) {
        do {
            System.out.print(messageInfo);
            String str = scanner.nextLine();
            if (str.matches(REGEX)) {
                return str;
            }
            System.out.println(messageError);
        } while (true);
    }

    public static boolean checkInputYN(String mess) {
        System.out.println(mess);
        while (true) {
            String result = scanner.nextLine();

            if (result.equalsIgnoreCase("Y")) {
                return true;
            }

            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

}
