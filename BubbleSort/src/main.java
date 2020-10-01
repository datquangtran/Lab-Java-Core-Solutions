
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author THAYCACAC
 */
public class main {

    private static final Scanner in = new Scanner(System.in);

    //check user input a number integer
    public static int getInt(String mess, int min, int max) {
        System.out.print(mess);
        while (true) {
            try {
                int number = Integer.parseInt(in.nextLine()); // ép kiểu dữ liệu nhập vào về int
                if (number < min || number > max) {   //kiểm tra điều kiện có nhập đúng sô nguyên > 0 không
                    System.out.print("Please input another integer in range: "); // hiển thị thông báo lỗi
                }else{
                return number;
                }
            } catch (NumberFormatException e) {
                System.out.print("Please input an integer number: ");  // hiển thị thông báo lỗi
            }
        }
    }


    private static int[] initArray(int n) {
        int[] a = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(n);
        }
        return a;
    }

    //sort array by bubble sort
    private static void sortArrayByBubbleSort(int[] a) {
        print(a, "Unsorted array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    //display array after sort
    private static void print(int[] a, String mess) {
        System.out.print(mess);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = getInt("Enter number of array: ", 1, Integer.MAX_VALUE);
        int[] a = initArray(n);
        sortArrayByBubbleSort(a);
        print(a, "Sorted array: ");
    }

}
