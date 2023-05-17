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
public class Controller {

    HashMap<String, Doctor> dt = new HashMap<String, Doctor>();

    //them thong tin 1 doctor vao hashmap
    public boolean addDoctor(Doctor doc) {
        // neu doc la null thi in ra thong bao sai
        if (doc == null) {
            System.out.println("Data does not exist");
            // tra ve false thi phan tu se khong duoc them vao hashmap
            return false;
        } else {
            //neu doc khac null thi thuc hien try catch
            try {
                //duyet tung phan tu trong hashmap
                for (Map.Entry<String, Doctor> entry : dt.entrySet()) {
                    String key = entry.getKey();
                    Doctor value = entry.getValue();
                    //neu co phan tu nao trung thi in ra thong bao
                    if (doc.Code.equals(key)) {
                        System.out.println("Doctor code [" + doc.Code + "] is duplicate");
                        // tra ve false thi phan tu se khong duoc them vao hashmap
                        return false;
                    }
                }
                //in ra thong bao neu hashmap la null
            } catch (NullPointerException ex) {
                System.out.println("Database does not exist");
            }
        }
        //neu khong co phan tu nao trung thi in ra thong bao
        System.out.println("Status doctor added.");
        // tra ve true thi phan tu se duoc them vao hashmap
        return true;
    }

    //sua thong tin 1 doctor trong hashmap
    public boolean updateDoctor(Doctor doc) {
        // neu doc la null thi in ra thong bao sai
        if (doc == null) {
            System.out.println("Data does not exist");
            // tra ve false thi phan tu chua duoc sua
            return false;
        }
        try {
            //duyet tung phan tu trong hashmap
            for (Map.Entry<String, Doctor> entry : dt.entrySet()) {
                String key = entry.getKey();
                Doctor value = entry.getValue();
                //neu co phan tu nao trung thi ra ve true de in ra thong bao Status doctor fix
                if (doc.Code.equals(key)) {
                    System.out.println("Status doctor fix.");
                    dt.put(key, doc);
                    return true;
                }
            }
            //in ra thong bao neu hashmap la null
        } catch (NullPointerException ex) {
            System.out.println("Database does not exist");
        }
        //neu doctor code khong co trong hashmap
        System.out.println("Doctor code doesn't exist");
        // tra ve false thi phan tu chua duoc sua
        return false;
    }

    public boolean deleteDoctor(Doctor doc) {
        // neu doc la null thi in ra thong bao sai
        if (doc == null) {
            System.out.println("Data does not exist");
            // tra ve false thi phan tu chua duoc xoa
            return false;
        }
        try {
            //duyet tung phan tu trong hashmap
            for (Map.Entry<String, Doctor> entry : dt.entrySet()) {
                String key = entry.getKey();
                Doctor value = entry.getValue();
                //neu co phan tu nao trung thi ra ve true de in ra thong bao Status doctor fixed
                if (doc.Code.equals(value.Code) && doc.Name.equals(value.Name) && doc.Specialization.equals(value.Specialization) && doc.Availability == value.Availability) {
                    System.out.println("Status doctor fixed.");                    
                    dt.remove(key);
                    return true;
                }
            }
            //in ra thong bao neu hashmap la null
        } catch (NullPointerException ex) {
            System.out.println("Database does not exist");
        }
        //neu doctor khong co trong hashmap
        System.out.println("Doctor information wrong or doesn't exist");
        // tra ve false thi phan tu chua duoc xoa
        return false;
    }

    // tim kiem thong tin doctor trong hashmap
    public HashMap<String, Doctor> searchDoctor(String input) {
        //tao 1 hashmap de chua phan tu tim duoc
        HashMap<String, Doctor> hm = new HashMap<String, Doctor>();
        if (dt.isEmpty()) {
            System.out.println("There are no doctor in database");
        } else if (input.equals("")) {
            //neu trong hashmap khong co phan tu nao
            return dt;
        } else {
            try {
                //duyet tung phan tu trong hashmap
                for (Map.Entry<String, Doctor> entry : dt.entrySet()) {
                    String key = entry.getKey();
                    Doctor value = entry.getValue();
                    String ts = String.valueOf(value.Availability);
                    //neu co phan tu nao chua string input thi them vao hashmap hm
                    if (value.Code.contains(input) || value.Name.contains(input) || value.Specialization.contains(input) || ts.contains(input)) {
                        hm.put(key, value);
                    }
                }
                //in ra thong bao neu hashmap la null
            } catch (NullPointerException ex) {
                System.out.println("Database does not exist");
            }
            //neu khong co phan tu nao chua string input
            if (hm.isEmpty()) {
                System.out.println("There are no doctor match your input");
            }
        }
        //tra ve ket qua tim kiém
        return hm;
    }
}
