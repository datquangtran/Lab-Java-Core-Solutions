/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // step 1: Input a number of array\
        
        int n = positiveDecimalNumber("Please enter number of array : ");
        // Step 2: Enter search number
        
        int searchNumber = positiveDecimalNumber("Please enter number to search in array :");
        // Step 2 :Create random number of array
        int[] array = randomNumberarray(n);
        // Step 3: Dispaly unsorted array
        displayUnsortedArray(array);
        //Step 4: Linear search. 
        int index = linearSearch(array, searchNumber);
        // Step 5: Display the index of search number in array.
        displayIndex(index, searchNumber);

    }

    private static int positiveDecimalNumber(String msg) throws Exception {
        // check each value number of array
        int n;
        while (true) {
            try {
                System.out.println(msg);
                Scanner sc = new Scanner(System.in);
                n = Integer.parseInt(sc.nextLine());
                if (n < 1) {
                    throw new Exception();
                }
                return n;
            } catch (NumberFormatException ex) {
                System.out.println("Please input a positive decimal number ");
            }
        }

    }

    private static int[] randomNumberarray(int n) {
        //call random parent
        Random rd = new Random();
        //initialize array include n values
        int[] array = new int[n];
        //random each value of array
        for (int i = 0; i < n; i++) {
            array[i] = rd.nextInt(n);
        }
        return array;
    }

    private static void displayUnsortedArray(int[] array) {
        System.out.print("The array: [");
        //print element of array
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.print(array[array.length - 1] + "]");
        System.out.println("");
    }

    private static int linearSearch(int[] array, int searchNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                return i;
            }
        }
        return -1;
    }

    private static void displayIndex(int index, int searchNumber) {
        if (index >= 0) {
            System.out.println("Found " + searchNumber + " at index: " + index);
        } else {
            System.out.println("Not found " + searchNumber + " in the array!");
        }
    }

}
