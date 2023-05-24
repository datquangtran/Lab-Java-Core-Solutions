/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findword;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Admin
 */
public class Findword {
    //getString method
    public static String getString() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if(s.isEmpty()) {
                System.out.println("Please enter again");
                continue;
            
        }
        return s;

        }
            
        
      
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //user enter file name
        String fileName = getString();
        //user enter word to find
        String word = getString();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("input.txt")));
            String line;
            String[] words;
            

            while ((line = br.readLine()) != null) {
                words = line.split("//s+");
                for(String w : words)
                    if(w.contains(word))
                        System.out.println(w);
            }
            br.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("Error");
        }
        


    }
    
}
