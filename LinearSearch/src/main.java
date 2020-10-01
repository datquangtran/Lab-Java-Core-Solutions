


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TranHieu
 */
public class main {

    private static Scanner sc = new Scanner(System.in);

    public static int check(String mess, int min, int max) {
        System.out.print(mess);
        while (true) {
            
            try {
                int number = Integer.parseInt(sc.nextLine()); // ép kiểu dữ liệu nhập vào về int
                if (number < min || number > max) {   //kiểm tra điều kiện có nhập đúng sô nguyên > 0 không
                    System.out.print("Please input another integer: "); // hiển thị thông báo lỗi
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an integer number: ");  // hiển thị thông báo lỗi
            }
        }
    }

    static void linearSearch(int[] arr, int value) {
        int size = arr.length;
        boolean check = false;
        for (int i = 0; i < size; i++) { // i chạy từ 0 đến size
            if (arr[i] == value) { // nếu phần tử nào bằng giá trị cần search
                if (check == false) {
                    System.out.print("Found " + value + " at index: ");
                }
                check = true;
                System.out.print(" " + i);
            }
        }
        if (check == false) {
            System.out.println("Not exits");
        }
        System.out.println("");
    }

    static void display(int[] a) {
        int size = a.length;
        for (int i = 0; i < size; i++) {  // i chạy từ 0 đến size
            if (i != size - 1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.println(a[i]);
            }
        }
    }

    
    public static int[] randomArray(int size) {
        int[] array = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) { // i chạy từ 0 đến size
            array[i] = r.nextInt(size);
        }
        return array;
    }

    
    public static void main(String[] args) {
        int size = check("Enter number of array: ", 1, Integer.MAX_VALUE);// nhập vào size
        int[] arr = randomArray(size);  // tạo 1 mảng với size phần tử
        System.out.print(" Array: ");
        display(arr);    
        int value = check("Enter search value: ", Integer.MIN_VALUE, Integer.MAX_VALUE);// nhập giá trị muốn search
        linearSearch(arr, value);
    }
}
