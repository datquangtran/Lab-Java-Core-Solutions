/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0055;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class View {
    // ham kiem tra so nhap vao
    public static int checkso() {
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
                //neu n<0 thi nhap lai
                if (n >= 0) {
                    kt = false;
                } else {
                    System.out.println("Input a positive number");
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
    public static String checkstring() {
        //khai bao Scanner
        Scanner sc = new Scanner(System.in);
        boolean kt = true;
        // khai bao string n
        String n = "";
        while (kt == true) {
            n = sc.nextLine();
            kt = false;
        }
        // chuan hoa xau n
        n = n.trim();
        n = n.replaceAll("\\s+", " ");
        return n;
    }

    // ham kiem tra so nhap vao
    public static int checkluachon() {
        //khai bao Scanner
        Scanner sc = new Scanner(System.in);
        // khai bao kt la true
        boolean kt = true;
        // khai bao n
        int n = 0;
        while (kt == true) {
            try {
                n = sc.nextInt();
                //neu 0<n<6 thi kt = false
                if (n > 0 && n < 6) {
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
    Controller ut = new Controller();
    //ham in ra  menu cua chuong trinh
    public void menu() {
        //in ra menu cua chuong trinh Doctor Managerment
        System.out.println("========= Doctor Managerment =========");
        //in ra loai chuc nang thu 1
        System.out.println("1. Add Doctor");
        //in ra loai chuc nang thu 2
        System.out.println("2. Update Doctor");
        //in ra loai chuc nang thu 3
        System.out.println("3. Delete Doctor");
        //in ra loai chuc nang thu 4
        System.out.println("4. Search Doctor");
        //in ra loai chuc nang thu 5
        System.out.println("5. Exit");
    }
    //ham add de nhap thong tin doctor can them vao
    public void Add() {
        String code, name, spec;
        int avai;
        //in ra menu cua chuc nang Add Doctor
        System.out.println("--------- Add Doctor ---------");
        //in ra thong bao nhap Code
        System.out.println("Enter Code");
        //luu tru Code cua doctor trong bien code
        code = checkstring();
        //in ra thong bao nhap Name
        System.out.println("Enter Name");
        //luu tru Name cua doctor trong bien name
        name = checkstring();
        //in ra thong bao nhap Specialization
        System.out.println("Enter Specialization");
        //luu tru Specialization cua doctor trong bien spec
        spec = checkstring();
        //in ra thong bao nhap Availability
        System.out.println("Enter Availability");
        //luu tru Availability cua doctor trong bien avai
        avai = checkso();
        //tao 1 bien doc de luu toan bo gia tri vua nhap
        Doctor doc = new Doctor(code, name, spec, avai);
        //goi ham addDoctor de thuc hien chuc nang them thong tin
        if (ut.addDoctor(doc)) {
            ut.dt.put(code, doc);
        }
    }

    public void Update() {
        String code, name, spec;
        int avai;
        //in ra menu cua chuc nang Update Doctor
        System.out.println("--------- Update Doctor ---------");
        //in ra thong bao nhap Code
        System.out.println("Enter Code");
        //luu tru Code cua doctor trong bien code
        code = checkstring();
        //in ra thong bao nhap Name
        System.out.println("Enter Name");
        //luu tru Name cua doctor trong bien name
        name = checkstring();
        //in ra thong bao nhap Specialization
        System.out.println("Enter Specialization");
        //luu tru Specialization cua doctor trong bien spec
        spec = checkstring();
        //in ra thong bao nhap Availability
        System.out.println("Enter Availability");
        //luu tru Availability cua doctor trong bien avai
        avai = checkso();
        //tao 1 bien doc de luu toan bo gia tri vua nhap
        Doctor doc = new Doctor(code, name, spec, avai);
        //goi ham updateDoctor de thuc hien chuc nang cap nhat thong tin
        ut.updateDoctor(doc);
    }

    public void Delete() {
        String code, name, spec;
        int avai;
        //in ra menu cua chuc nang Delete Doctor
        System.out.println("--------- Delete Doctor ---------");
        //in ra thong bao nhap Code
        System.out.println("Enter Code");
        //luu tru Code cua doctor trong bien code
        code = checkstring();
        //in ra thong bao nhap Name
        System.out.println("Enter Name");
        //luu tru Name cua doctor trong bien name
        name =checkstring();
        //in ra thong bao nhap Specialization
        System.out.println("Enter Specialization");
        //luu tru Specialization cua doctor trong bien spec
        spec = checkstring();
        //in ra thong bao nhap Availability
        System.out.println("Enter Availability");
        //luu tru Availability cua doctor trong bien avai
        avai = checkso();
        //tao 1 bien doc de luu toan bo gia tri vua nhap
        Doctor doc = new Doctor(code, name, spec, avai);
        //goi ham deleteDoctor de thuc hien chuc nang xoa thong tin
        ut.deleteDoctor(doc);
    }

    public void Search() {
        //tao hashmap la hm de luu tru ket qua tim duoc
        HashMap<String, Doctor> hm = new HashMap<String, Doctor>();
        String text;
        //in ra menu cua chuc nang Search Doctor
        System.out.println("--------- Search Doctor ---------");
        //in ra thong bao nhap chuoi ky tu can tim
        System.out.println("Enter Text");
        //text luu tru chuoi ky tu nguoi dung nhap vao
        text = checkstring();
        //in ra bang ket qua
        System.out.println("--------- result ---------");
        System.out.printf("%-10s %-15s %-15s %-10s\n", "Code", "Name", "Specialization", "Availability");
        //goi ham searchDoctor de thuc hien chuc nang tim kiem thong tin roi luu ket qua vao hm
        hm = ut.searchDoctor(text);
        //in ra ket qua
        for (Map.Entry<String, Doctor> entry : hm.entrySet()) {
            Doctor value = entry.getValue();
            System.out.printf("%-10s %-15s %-15s %-10d\n", value.Code, value.Name, value.Specialization, value.Availability);
        }
    }
}
