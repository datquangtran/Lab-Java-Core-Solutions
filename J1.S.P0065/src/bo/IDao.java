/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

/**
 *
 * @author Admin
 */
public interface IDao<Student> {

    boolean add();

    double averageStudent(double maths, double chemistry, double physics);

    String getTypeStudent(double mark);
    
    void display();
    
    void percentTypeStudent();
    
}
