/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Expense;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ExpenseBo implements IDao<Expense> {

    private List<Expense> list; // value= null

    public ExpenseBo() {
        this.list = new ArrayList<>();
    }

    public ExpenseBo(List<Expense> list) {
        this.list = list;
    }

    @Override
    public boolean add() {
        Expense s = new Expense();
        for (int i = list.size() - 1; i >= 0; i--) {
            s.setID(this.list.get(i).getID() + 1);
            break;
        }
        s.input();
        System.out.println("Add Successfully");
        return this.list.add(s);
    }

    @Override
    public void display() {
        double sum = 0;
        System.out.println("ID \t\t Date \t\t\t Number \t Content");
        this.list.forEach(System.out::println);
        for (Expense s : this.list) {
            sum += s.getNumber();
        }
        System.out.println("Total :" + sum);
    }

    @Override
    public boolean remove(int num) {
        for (int i = this.list.size() - 1; i >= 0; --i) {
            if (this.list.get(i).getID() == num) {
                this.list.remove(i);
                resetID();
                return true;
            }
        }
        return false;
    }

    @Override
    public void resetID() {
      for(int i=0;i<=this.list.size()-1;i++){
          this.list.get(i).setID(i+1);
      }
    }

}
