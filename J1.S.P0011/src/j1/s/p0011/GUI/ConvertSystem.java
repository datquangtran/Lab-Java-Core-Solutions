/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011.GUI;

import java.math.BigInteger;

/**
 *
 * @author hoang
 */
public class ConvertSystem {

    //Converter from Decimal to Binary
    public static String DecToBin(BigInteger number) {
        String binary = "";

        // Lặp lại quá trình chia cho 2 và lưu số dư
        while (number.compareTo(new BigInteger("0")) == 1) {
            // Lấy số dư sau khi chia cho 2, chuyển thành số nguyên và thêm vào chuỗi binary
            int add = number.remainder(new BigInteger("2")).intValue();
            binary = add + binary;
            // Tiếp tục chia số đang xét cho 2 để lấy kết quả kế tiếp
            number = number.divide(new BigInteger("2"));
        }
        // Nếu chuỗi binary rỗng, trả về 0, ngược lại trả về chuỗi binary
        return (binary.length() > 0) ? binary : "0";
    }

    //Converter from Binary to Decimal
    public static BigInteger BinToDec(String binary) {
        BigInteger decimal = new BigInteger("0");   // khởi tạo biến kết quả
        int i;
        BigInteger mul = new BigInteger("1");   //khởi tạo giá trị multiply = 1

        // Xử lý từng ký tự trong chuỗi nhị phân từ cuối lên đầu
        for (i = binary.length() - 1; i >= 0; --i) {
            if (binary.charAt(i) == '1') {   // nếu kí tự đang duyệt = 1 
                decimal = decimal.add(mul);   // Cộng giá trị của multiplier hiện tại vào kết quả.
            }
            mul = mul.multiply(new BigInteger("2"));   // Nhân giá trị của multiplier hiện tại với 2 
        }

        return decimal;   // trả về kết quả
    }

    //Converter from Decimal to Hexadecimal
    public static String DecToHex(BigInteger number) {
        String hexa = "";

        // Vòng lặp sẽ được thực hiện cho đến khi giá trị của number trở thành số không hoặc số âm
        while (number.compareTo(new BigInteger("0")) == 1) {

            // Tìm phần dư của số number sau khi chia cho 16
            BigInteger temp = number.remainder(new BigInteger("16"));
            char ch;

            // Nếu temp là 1 số từ 0 đến 9, cộng thêm 48 vào giá trị ASCII và thêm vào chuỗi hexa
            if (temp.compareTo(new BigInteger("10")) == -1) {
                ch = (char) (temp.intValue() + 48);
                hexa = ch + hexa;
            } // Nếu temp lớn hơn 9, cộng với 55 vào giá trị ASCII và thêm vào chuỗi hexa
            else {
                ch = (char) (temp.intValue() + 55);
                hexa = ch + hexa;
            }

            // Chia số number cho 16
            number = number.divide(new BigInteger("16"));
        }

        // Nếu chuỗi hexa không rỗng, trả về chuỗi hexa. Nếu không, trả về chuỗi "0"
        return (hexa.length() > 0) ? hexa : "0";
    }

    //Hexadecimal to Decimal
    public static BigInteger HexToDec(String hexa) {
        BigInteger decimal = new BigInteger("0"); //Khởi tạo giá trị ban đầu bằng 0
        int i;

        BigInteger mul = new BigInteger("1"); //Khởi tạo giá trị ban đầu bằng 1, lưu giá trị hệ số nhân cho mỗi ký tự trong chuỗi hexa
        for (i = hexa.length() - 1; i > -1; --i) { //Lặp lại quá trình chuyển đổi cho mỗi ký tự trong chuỗi hexa
            BigInteger add;
            char temp = hexa.charAt(i); //Lấy ký tự tại vị trí i trong chuỗi hexa
            if (temp == '0') { //Nếu ký tự đó là 0 thì không cần xử lý gì
                //nếu kí tự là số đang ở hệ 16, lấy mã ascii trừ đi 48 để lấy mã ascii ở hệ 10 và nhân với hệ số multiple tương ứng 
            } else if (temp >= '1' && temp <= '9') {
                add = BigInteger.valueOf((int) temp - 48);
                decimal = decimal.add(add.multiply(mul)); //Cộng giá trị vào trong decimal
            } else {
                //nếu kí tự là chữ, lấy mã ascii trừ đi 55 để lấy mã ascii ở hệ 10 và nhân với hệ số multiple tương ứng với vị trí 
                add = BigInteger.valueOf((int) temp - 55); 
                decimal = decimal.add(add.multiply(mul)); //Cộng giá trị vào trong decimal
            }
            mul = mul.multiply(new BigInteger("16")); //Tăng hệ số nhân lên 16 để xử lý ký tự tiếp theo
        }
        return decimal; //Trả về kết quả và tổng của phép biến đổi từng số từ hệ 
    }
    //Binary to Hexadecimal is a process that combine two task BinToDec and DecToHex

    public static String BinToHex(String binary) {
        BigInteger decimal = BinToDec(binary);
        String hexa = DecToHex(decimal);

        return hexa;
    }

    //The same with above, combine two program HexToDec and DecToBin
    public static String HexToBin(String hexa) {
        BigInteger decimal = HexToDec(hexa);
        String binary = DecToBin(decimal);

        return binary;
    }
}
