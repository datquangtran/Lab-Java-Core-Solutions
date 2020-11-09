/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

import entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Data {

    public static List<Student> list= new ArrayList<Student>(){
        {
            add(new Student("Nhat Minh", "12 Tin", "C" ,4 , 5, 6, 5));
            add(new Student("Quoc Sanh ", "12 Sinh", "B", 5, 6, 7,6));
            add(new Student("Minh Hoang", "12 Hoa", "B", 6, 7, 8, 7));
            add(new Student("Truong Giang", "12 Hoa", "A", 8, 9, 10, 9));
        }
    };
    
}
