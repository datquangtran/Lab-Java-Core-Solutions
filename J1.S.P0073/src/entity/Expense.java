/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import Validation.Validate;


public class Expense {

    private int ID=0;
    private String date,content;
    private double number;
    Validate check=new Validate();
    public Expense() {
    }

    public Expense(int ID, String date, double number, String content) {
        this.ID = ID;
        this.date = date;
        this.number = number;
        this.content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
       
    public void input() {
        this.date = check.inputDate("Enter Date:");
        this.number = check.getDouble("Enter a amount:", 0, Double.MAX_VALUE);
        this.content = check.inputString("Enter content:");
    }

    @Override
    public String toString() {
        return ID + "\t\t" + date + "\t\t" + number + "\t\t" + content;
    }

}
