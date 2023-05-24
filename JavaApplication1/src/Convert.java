/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Convert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true){
            int choice = Manager.inputChoiceMenu();
            switch (choice){
            case 1:
                Manager.ConvertFromBinary();
                break;
            case 2:
                Manager.ConvertFromDecimal();
                break;
            case 3:
                Manager.ConvertFromHexa();
                break;
                
            case 4: return;
        }
        }
    }
    
}
