
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyList M = new MyList();
        M.traverse();
        for (int i = 1; i <= 10; i++) {
            M.add(i);
            M.traverse();
            M.DeleteFirst();
            System.out.println("SAU KHI XOA");
            M.traverse();
        }
//        int x;
//        Scanner key = new Scanner(System.in);
//        System.out.println("NHAP SO CAN TIM: ");
//        x = key.nextInt();
//        Node p = new Node();
//        p = M.search(x);
//        if(p==null){
//            System.out.println("KHONG TIM THAY PHAN TU" + x);
//            
//        }else{
//            System.out.println("DA TIM THAY "+ p.info);
//        }

        }
    
    }
    

