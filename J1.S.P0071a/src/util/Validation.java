package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Validation {

    private Scanner scanner = new Scanner(System.in);

    public int getInt(String mess, int min, int max) {
        System.out.println(mess);
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (min <= number && number <= max) {
                    return number;
                } else {
                    System.out.println("Out rage!Pls Enter number(" + min + "," + max + "):");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid!Must a number!Retype(1-4):");
            }
        }
    }

    public double getDouble(String mess, double min, double max) {
        System.out.println(mess);
        while (true) {
            try {
                double number = Double.parseDouble(scanner.nextLine());
                if (min <= number && number <= max) {
                    return number;
                } else {
                    System.out.println("Out rage!Pls Enter number(" + min + "," + max + "):");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid!Must a number!Retype:");
            }
        }
    }

    public String inputString(String mess) {
        System.out.print(mess);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("Not emty content!Pls enter content");
            } else {
                return input;
            }
        }
    }

    public String inputDate(String mess) {
        System.out.print(mess);
        //set format of date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        //force user input exectly a date
        while (true) {
            try {
                Date date = dateFormat.parse(scanner.nextLine());
                //get current date
                Date curDate = Calendar.getInstance().getTime();
                //check range of date
                if (curDate.compareTo(date) < 0) {
                    System.out.print("Please input date that before current date: ");
                } else {
                    return dateFormat.format(date);
                }
            } catch (Exception e) {
                System.out.print("Please input valid date (dd-MM-yyyy): ");
            }
        }
//        System.out.print(mess);
//        //set format of date
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//        dateFormat.setLenient(false);
//        //force user input exectly a date
//        while (true) {
//            try {
//                Date date = dateFormat.parse(scanner.nextLine());        
//                return dateFormat.format(date);
//            } catch (Exception e) {
//                System.out.print("Please input valid date (dd-MM-yyyy): ");
//            }
//        }
    }

    public float inputHours(String mess) {
        System.out.println(mess);

        while (true) {
            try {
                String input = scanner.nextLine();
                float number = 0;
                if (input.matches("[0-9]+|[0-9]+.[05]([0]+)?") && Float.parseFloat(input) >= 8
                        && Float.parseFloat(input) <= 17.5) {
                    number = Float.parseFloat(input);
                    return number;
                } else {
                    System.out.println("Invalid or Out range!Pls retype(8.0-17.5):");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid!" + e.getMessage());
            }

        }
    }

}
