/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0055;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    

    public static void main(String[] args) {
        //khoi tao bien exit co gia tri la false
        boolean exit = false;
        //khoi tao bien d co dang du lieu la View
        View d = new View();
        //khoi tao bien ut co dang du lieu la Controller
        Controller ut = new Controller();
        //goi ham menu trong d
        d.menu();
        //neu exit bang false thi nguoi nhap dc tiep tuc thuc hien cac chuc nang cua chuong trinh
        while (exit == false) {
            //dat bien s nhap loai chuc nang can dung
            int s = d.checkluachon();
            //voi moi s duoc nhap vao co 1 chuc nang khac nhau
            switch (s) {
                case 1:
                    //goi ham add trong d
                    d.Add();
                    //thoat khoi switch
                    break;
                case 2:
                    //goi ham update trong d
                    d.Update();
                    //thoat khoi switch
                    break;
                case 3:
                    //goi ham delete trong d
                    d.Delete();
                    //thoat khoi switch
                    break;
                case 4:
                    //goi ham search trong d
                    d.Search();
                    //thoat khoi switch
                    break;
                case 5:
                    //dat exit bang true de thoat khoi vong lap
                    exit = true;
                    //thoat khoi switch
                    break;
                default:
                    //thoat khoi switch
                    break;
            }
        }
    }
}
