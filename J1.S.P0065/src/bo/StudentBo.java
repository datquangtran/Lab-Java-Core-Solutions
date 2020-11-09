/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentBo implements IDao<Student> {

    private Scanner scanner = new Scanner(System.in);

    private List<Student> list; // value= null
    
    public StudentBo() {
        this.list = new ArrayList<>(); // value = [] array rỗng 
    }

    public StudentBo(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean add() {
        Student s = new Student();
        s.input();
        double score = averageStudent(s.getMaths(), s.getChemistry(), s.getPhysics());
        System.out.println("Add successfully!");
        s.setAverage(score);
        s.setType(getTypeStudent(score));
        return this.list.add(s);
    }

    @Override
    public double averageStudent(double maths, double chemistry, double physics) {
        double score = (maths + chemistry + physics) / 3;
        return score;
    }

    @Override
    public String getTypeStudent(double mark) {
        String result = "";
        if (mark > 7.5) {
            result = "A";
            return result;
        } else if (6 <= mark && mark <= 7.5) {
            result = "B";
            return result;
        } else if (4 <= mark && mark < 6) {
            result = "C";
            return result;
        } else {
            result = "D";
            return result;
        }
    }

    @Override
    public void display() {
        System.out.println("Name\t\t\tClasses\t\tAVG\t\tType");
        this.list.forEach(System.out::println);
        
    }

    @Override
    public void percentTypeStudent() {
        int a =0,b=0,c=0,d=0;

          for(  Student s: list){
            if (s.getAverage() > 7.5) {
                a++;
            } else if (6 <= s.getAverage()&& s.getAverage() <= 7.5) {
                b++;
            } else if (4 <= s.getAverage() && s.getAverage() < 6) {
                c++;
            } else {
                d++;
            }
          }

        System.out.println("--------Classification Info -----");
        System.out.println("A:" + (float) (a * 100 / this.list.size()) + "%");
        System.out.println("B:" + (float) (b * 100 / this.list.size()) + "%");
        System.out.println("C:" + (float) (c * 100 / this.list.size()) + "%");
        System.out.println("D:" + (float) (d * 100 / this.list.size()) + "%");
    }
}
//        for (int i = 0; i <= this.list.size() - 1; i++) {
//            if (this.list.get(i).getAverage() > 7.5) {
//                a++;
//            } else if (6 <= this.list.get(i).getAverage() && this.list.get(i).getAverage() <= 7.5) {
//                b++;
//            } else if (4 <= this.list.get(i).getAverage() && this.list.get(i).getAverage() < 6) {
//                c++;
//            } else {
//                d++;
//            }
//        }