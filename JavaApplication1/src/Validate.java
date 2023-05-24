
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
class Validate {
    private final static Scanner in = new Scanner(System.in);
    
    public static int checkInputLimit(int min, int max){
        while(true){
            try{
                int result = Integer.parseInt(in.nextLine().trim());
                if(result > max || result < min){
                    throw new NumberFormatException();
                }
                return result;
            } catch(NumberFormatException ex){
                System.out.println("Must be integer in [" + min + "," + max + "]");
                System.out.println("Enter again");
            }
        }
    }
    
    public static String checkInputBase(String mess, String base, String regex){
        System.out.println("Enter a: " + base + "number");
        String result;
        while(true){
            result = in.nextLine().trim();
            if(!result.matches(regex)){
                System.out.println(mess);
                System.out.println("Enter again: ");
            }else {
                return result;
            }
        }
    }
}
