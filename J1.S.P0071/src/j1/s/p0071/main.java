/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

/**
 *
 * @author ASUS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //khoi tao bien exit co gia tri la false
        boolean exit = false;
        //khoi tao bien ts co dang du lieu la View
        View ts= new View();
        //khoi tao bien ut co dang du lieu la Controller
        Controller ut = new Controller();
        //khoi tao id bang 0
        while (exit == false) {
            //goi ham menu trong ts
            ts.menu();
            //voi moi s duoc nhap vao co 1 chuc nang khac nhau
            int s = ts.nhapLuachon();
            switch (s) {
                case 1:
                    //goi ham add trong ts co id duoc tang dan
                    ts.Add();
                    //thoat khoi switch
                    break;
                case 2:
                    //goi ham delete trong ts
                    ts.Delete();
                    //thoat khoi switch
                    break;
                case 3:
                    //goi ham show trong ts
                    ts.Show();
                    //thoat khoi switch
                    break;
                case 4:
                    //thoat khoi chuong trinh
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
