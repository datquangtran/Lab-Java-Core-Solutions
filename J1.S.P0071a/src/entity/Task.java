/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import util.Validation;

/**
 *
 * @author HP
 */
public class Task {

    private Validation check = new Validation();
    private int ID = 0;
    private String taskTypeId;
    private String requirementName;
    private String date;
    private float planFrom;
    private float planTo;
    private float time;
    private String assign;
    private String reviewer;

    public Task() {
    }

    public Task(int ID, String requirementName, String taskTypeId, String date, float planFrom, float planTo, float time, String assign, String reviewer) {
        this.ID = ID;
        this.taskTypeId = taskTypeId;
        this.requirementName = requirementName;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.time = time;
        this.assign = assign;
        this.reviewer = reviewer;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(String taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(float planFrom) {
        this.planFrom = planFrom;
    }

    public float getPlanTo() {
        return planTo;
    }

    public void setPlanTo(float planTo) {
        this.planTo = planTo;
    }

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public void input() {
        this.requirementName = check.inputString("Enter Name:");
        this.date = check.inputDate("Enter date:");
        while (true) {
            this.planFrom = check.inputHours("From :");
            this.planTo = check.inputHours("To: ");
            if ((this.planFrom < this.planTo)) {
                break;
            } else {
                System.err.println("Enter Time to end > time to begin!Pls retype:");
            }
        }
        this.assign = check.inputString("Enter assign:");
        this.reviewer = check.inputString("Enter reviewer:");
    }

    @Override
    public String toString() {
        return ID
                + "\t" + requirementName
                + "\t\t" + taskTypeId
                + "\t\t" + date
                + "\t" + time
                + "\t\t" + assign
                + "\t\t" + reviewer;

    }
}
