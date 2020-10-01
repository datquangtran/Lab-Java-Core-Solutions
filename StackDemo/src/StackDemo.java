/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class StackDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        myStack s = new myStack(100);
        for (int i = 0; i <= 10; i++) {
            s.push(i);
            //Duyet va lay cac phan tu trong Stack qua phuong thuc pop sau khi duyet Stack rong
            
        }
        System.out.println("Cac phan tu trong Stack la: ");
        while(!s.isEmpty()){
            int x = (int)s.pop();
            System.out.println(x +",");
        }
        s.pop();
    }
    
}
