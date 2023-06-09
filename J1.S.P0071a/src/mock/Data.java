/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

import entity.Task;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Data {

    public static List<Task> list = new ArrayList<Task>() {
        {
            add(new Task(1, "Dev Program", "Code", "25-2-2000", 8, (float) 16.5, (float) 8.5, "Dev", "Lead"));
            add(new Task(2, "Test Program", "Test", "28-3-2001", 9, 13, 4, "Tester", "Lead"));
            add(new Task(3, "Update Program", "Code", "28-2-2010", 8, 17, 9, "Dev", "Lead"));
            add(new Task(4, "Desgin FE", "Desgin", "28-2-2003", 8, 9, 1, "Dev", "Lead"));
            add(new Task(5, "Design Database", "Desgin", "28-2-2012", 9, 12, 3, "Dev", "Lead"));

        }
    };

}
