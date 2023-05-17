/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011.GUI;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class Main {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        //Options to display in menu
        String[] options = {"Enter a binary.", "Enter a decimal.", "Enter a hexadecimal.", "Exit the program."};

        int choiceFirst, choiceThen;

        do {
            //Display menu
            Display.displayMenu(options);

            //Choice-entered by user
            choiceFirst = validateInput.inputInt("Enter your 1st choice: ", 1, 4);
            if (choiceFirst == 4) {
                return;
            }
            choiceThen = validateInput.inputInt("Enter your 2nd choice: ", 1, 4);
            if (choiceThen == 4) {
                return;
            }

            if (choiceFirst == choiceThen) {
                System.out.println("Invalid choice. Re-enter.\n");
            } else {
                switch (choiceFirst) {
                    case 1:
                        //BIN to DEC
                        if (choiceThen == 2) {
                            String binary = validateInput.inputBin("Enter binary number: ", 512);
                            BigInteger decimal = ConvertSystem.BinToDec(binary);
                            System.out.println("Decimal Output: " + decimal);
                        } //BIN to HEX
                        else if (choiceThen == 3) {
                            String binary = validateInput.inputBin("Enter binary number: ", 512);
                            String hexa = ConvertSystem.BinToHex(binary);
                            System.out.println("Hexadecimal Output: " + hexa);
                        }
                        break;

                    case 2:
                        //DEC to BIN
                        if (choiceThen == 1) {
                            BigInteger decimal = validateInput.inputBigInt("Enter decimal number: ");
                            String binary = ConvertSystem.DecToBin(decimal);
                            System.out.println("Binary Output: " + binary);
                        } //DEC to HEX
                        else if (choiceThen == 3) {
                            BigInteger decimal = validateInput.inputBigInt("Enter decimal number: ");
                            String hexa = ConvertSystem.DecToHex(decimal);
                            System.out.println("Hexadecimal Output: " + hexa);
                        }
                        break;

                    case 3:
                        //HEX to BIN
                        if (choiceThen == 1) {
                            String hexa = validateInput.inputHexa("Enter hexadecimal number: ", 64);
                            String binary = ConvertSystem.HexToBin(hexa);
                            System.out.println("Binary Output: " + binary);
                        } //HEX to DEC
                        else if (choiceThen == 2) {
                            String hexa = validateInput.inputHexa("Enter hexadecimal number: ", 64);
                            BigInteger decimal = ConvertSystem.HexToDec(hexa);
                            System.out.println("Decimal Output: " + decimal);
                        }
                        break;
                    case 4:
                        return;
                }
            }
        } while (true);
    }
}
