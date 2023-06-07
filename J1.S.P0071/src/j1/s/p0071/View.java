/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class View {

    Controller ut = new Controller();
    //ham kiem tra ngay thang
    public String nhapdate() {
        Scanner sc = new Scanner(System.in);
        boolean kt = true;
        String k = "";
        while (kt == true) {
            try {
                //bien k chua gia tri user nhap vao
                k = sc.nextLine();
                //tao dinh dang ngay thanh là dd-mm-yyyy
                DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                //kiem tra xem chuoi ky tu k co phai la dinh dang ngay thang hay khong
                Date date = df.parse(k);
                kt = false;
                //neu co loi thi in ra thong bao va nhap lai
            } catch (Exception ex) {
                System.out.println("Input again with format DD-MM-YYYY");
            }
        }

        return k;
    }

    //ham kiem tra ke hoach
    public String nhapPlan(int type, String in) {
        //khai bao bien hr chua gia tri cua chuoi ky tu in, la thoi gian bat dau neu type khac 0
        float hr = Float.valueOf(in);
        Scanner sc = new Scanner(System.in);
        boolean kt = true;
        float n = 0;
        while (kt == true) {
            try {
                //bien n chua gia tri nhap vao
                n = sc.nextFloat();
                // neu n>=8 va n<=17.5 thi thuc hien cau len trong if
                if ((n >= 8) && (n <= 17.5)) {
                    // type bang 0 thi day la thoi gian bat dau nen thoat khoi while
                    if (type == 0) {
                        kt = false;
                        // type khac 0 thi day la thoi gian ket thuc. Neu thoi gian ket thuc lon hon thoi gian bat dau thi thoat khoi while
                    } else if (type != 0 && n > hr) {
                        kt = false;
                        // neu thoi gian ket thuc nho hon thoi gian bat dau thi in ra thong bao de nhap lai
                    } else {
                        System.out.println("Plan From must be less than Plan To");
                    }
                    //neu n<8 va n>17.5 thi in ra thong bao de nhap lai
                } else {
                    System.out.println("Plan From and Plan To must within 8 h-17 h 30: ");
                }
                //neu co loi thi in ra thong bao va nhap lai    
            } catch (InputMismatchException ex) {
                System.out.println("Input a float number:");
                sc.next();
            }
        }
        //tra ve chuoi ky tu la gia tri cua n
        return String.valueOf(n);
    }

    // ham kiem tra code nhap vao
    public static int nhapCode() {
        // khai bao kt la true
        boolean kt = true;
        //khai bao Scanner
        Scanner sc = new Scanner(System.in);
        // khai bao n
        int n = 0;
        while (kt == true) {
            try {
                // nhap so n
                n = sc.nextInt();
                //neu n<=0 hoac n>=5 thi nhap lai
                if (n > 0 && n < 5) {
                    kt = false;
                } else {
                    System.out.println("Code type must exist (1-4) ");
                }
            } // neu n khong phai la so
            catch (InputMismatchException ex) {
                System.out.println("Input a number:");
                sc.next();
            }
        }
        return n;
    }

    // ham kiem tra chuoi ky tu nhap vao
    public static String nhapString() {
        //khai bao Scanner
        Scanner sc = new Scanner(System.in);
        boolean kt = true;
        // khai bao string n
        String n = "";
        while (kt == true) {
            try {
                //n chua chuoi ki tu nhap vao
                n = sc.nextLine();
                //kiem tra xem n chua chu thuong va chu hoa hay khong
                if (n.matches("[A-Za-z]+")) {
                    kt = false;
                    //neu khong chua chu thuong va chu hoa thi in ra thong bao
                } else {
                    System.out.println("Input a valid name:");
                }
                //neu co loi thi in ra thong bao va nhap lai   
            } catch (InputMismatchException ex) {
                System.out.println("Input a valid name:");
                sc.next();
            }
        }
        // chuan hoa xau n
        n = n.trim();
        n = n.replaceAll("\\s+", " ");
        return n;
    }

    // ham kiem tra so nhap vao
    public static int nhapLuachon() {
        //khai bao Scanner
        Scanner sc = new Scanner(System.in);
        // khai bao kt la true
        boolean kt = true;
        // khai bao n
        int n = 0;
        while (kt == true) {
            try {
                n = sc.nextInt();
                //neu 0<n<5 thi kt = false
                if (n > 0 && n < 5) {
                    kt = false;
                    // neu sai thi in thong bao de nhap lai
                } else {
                    System.out.println("Please input again: ");
                }
                // neu n khong phai la so
            } catch (InputMismatchException ex) {
                System.out.println("Input a number:");
                sc.next();
            }
        }
        return n;
    }
    // ham nhap so
    public static int nhapso() {
        // khai bao kt la true
        boolean kt = true;
        //khai bao Scanner
        Scanner sc = new Scanner(System.in);
        // khai bao n
        int n = 0;
        while (kt == true) {
            try {
                // nhap so n
                n = sc.nextInt();
                kt = false;
            } 
            // neu n khong phai la so
            catch (InputMismatchException ex) {
                System.out.println("Input a number:");
                sc.next();
            }
        }
        return n;
    }
    //ham in ra  menu cua chuong trinh
    public void menu() {
         //in ra menu cua chuong trinh Task program
        System.out.println("========= Task program =========");
        //in ra loai chuc nang thu 1
        System.out.println("1. Add Task.");
        //in ra loai chuc nang thu 2
        System.out.println("2. Delete Task.");
        //in ra loai chuc nang thu 3
        System.out.println("3. Show task.");
        //in ra loai chuc nang thu 4
        System.out.println("4. Exit.");
    }
    //ham add de nhap thong tin can them vao
    public void Add() {
        
        String RequirementName, Date, Assignee, Reviewer;
        String PlanFrom, PlanTo;
        int TaskTypeID;
        //in ra menu cua chuc nang
        System.out.println("--------- Add Task ---------");
        //in ra thong bao nhap Requirement Name
        System.out.println("Enter Requirement Name");
        RequirementName = nhapString();
        //in ra thong bao nhap Task Type
        System.out.println("Enter Task Type");
        TaskTypeID = nhapCode();
        //in ra thong bao nhap Date
        System.out.println("Enter Date");
        Date = nhapdate();
        //in ra thong bao nhap From
        System.out.println("Enter From");
        PlanFrom = nhapPlan(0, "0");
        //in ra thong bao nhap To
        System.out.println("Enter To");
        PlanTo = nhapPlan(1, PlanFrom);
        //in ra thong bao nhap Assignee
        System.out.println("Enter Assignee");
        Assignee = nhapString();
        //in ra thong bao nhap Reviewer
        System.out.println("Enter Reviewer");
        Reviewer = nhapString();
        //neu TaskTypeID la 1 thi phan tu duoc them vao tap hop co chua thong tin la Code
        if (TaskTypeID == 1) {
            ut.addTask(RequirementName, Assignee, Reviewer, "Code", Date, PlanFrom, PlanTo);
        }
        //neu TaskTypeID la 2 thi phan tu duoc them vao tap hop co chua thong tin la Test
        if (TaskTypeID == 2) {
            ut.addTask(RequirementName, Assignee, Reviewer, "Test", Date, PlanFrom, PlanTo);
        }
        //neu TaskTypeID la 3 thi phan tu duoc them vao tap hop co chua thong tin la Design
        if (TaskTypeID == 3) {
            ut.addTask(RequirementName, Assignee, Reviewer, "Design", Date, PlanFrom, PlanTo);
        }
        //neu TaskTypeID la 4 thi phan tu duoc them vao tap hop co chua thong tin la Review
        if (TaskTypeID == 4) {
            ut.addTask(RequirementName, Assignee, Reviewer, "Review ", Date, PlanFrom, PlanTo);
        }
    }
    //ham delete de nhap id can xoa
    public void Delete() {
        int code;
        //in ra menu cua chuc nang
        System.out.println("--------- Del Task ---------");
        //in ra thong bao nhap ID
        System.out.println("ID:");
        code = nhapso();
        //xoa phan tu co trong tap hop
        ut.deleteTask(code);
    }
    //ham in toan bo phan tu trong tap hop
    public void Show() {
        //in ra bang ket qua
        System.out.println("------------------------ Task ---------------------");
        System.out.printf("%-3s %-15s %-10s %-10s %-10s %-15s %-15s\n", "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
        //goi ham in ra cac phan tu hien co trong tap hop
        ut.showTask();
    }
}
