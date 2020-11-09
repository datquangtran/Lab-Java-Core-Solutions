/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import validate.Validation;

/**
 *
 * @author Admin
 */
public class Student {

    Validation check = new Validation();
    private String name, classes, type;
    double maths, chemistry, physics, average;

    public Student() {
    }

    public Student(String name, String classes, String type, double maths, double chemistry, double physics, double average) {
        this.name = name;
        this.classes = classes;
        this.type = type;
        this.maths = maths;
        this.chemistry = chemistry;
        this.physics = physics;
        this.average = average;
    }


    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMaths() {
        return maths;
    }

    public void setMaths(double maths) {
        this.maths = maths;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void input() {
        this.name = check.getInput("Enter name:");
        this.classes = check.getInput("Enter classes:");
        this.maths = check.getDouble("Enter score maths:", 0, 10);
        this.chemistry = check.getDouble("Enter score chemistry:", 0, 10);
        this.physics = check.getDouble("Enter score physics:", 0, 10);
    }

    @Override
    public String toString() {
        return  name
                + "\t\t" + classes
                + "\t\t" + average
                + "\t\t" + type;

    }

}
