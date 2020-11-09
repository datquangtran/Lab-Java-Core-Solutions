/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

import entity.Expense;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Data {

    public static List<Expense> list = new ArrayList<Expense>() {
        {
            add(new Expense(1, "29-02-2000", 2000, "Minh Do"));
            add(new Expense(2, "29-05-2000", 3000, "Giang Dang"));
            add(new Expense(3, "17-08-2000", 4000, "Sanh"));
              add(new Expense(4, "08-10-2000", 5000, "Hoang Gay"));
        }
    };
}
