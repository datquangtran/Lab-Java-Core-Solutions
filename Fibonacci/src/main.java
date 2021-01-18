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

    public static int Fibonacci(int i) {
        if (i <= 1) {
            return i;
        }
        return Fibonacci(i - 1) + Fibonacci(i - 2);
//        if(i == 0){
//            arr[i] = 0;
//            return 0;
//        }else if(i == 1){
//            arr[i] = 1;
//            return 1;
//        }else{
//            arr[i] = arr[i-1] + arr[i-2];
//            return arr[i];
//        }
    }

    public static void main(String[] args) {

        System.out.println("The 45 sequence fibonacci");

        for (int i = 0; i < 44; i++) {
            System.out.print(Fibonacci(i) + ", ");
        }
        System.out.println(Fibonacci(45));

//        System.out.println("The 45 sequence fibonacci");
//        main m = new main();
//        int sum = 0;
//        int [] arr = new int [45];
//            
//        for (int i = 0; i < 45; i++) {
//            sum += m.Fibonacci(arr,i);
//            System.out.print(m.Fibonacci(arr,i) + ", ");
//        }
//        System.out.println();
//        System.out.println(sum);
    }

}
