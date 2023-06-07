/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

/**
 *
 * @author ASUS
 */
public class Task {

    private String requirementName, assignee, reviewer, taskTypeID, Date, PlanFrom, PlanTo;
    private int id;
    public Task() {
    }

    public int getId() {
        return id;
    }

    

    public String getRequirementName() {
        return requirementName;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public String getTaskTypeID() {
        return taskTypeID;
    }

    public String getDate() {
        return Date;
    }

    public Task(String requirementName, String assignee, String reviewer, String taskTypeID, String Date, int id, String PlanFrom, String PlanTo) {
        this.requirementName = requirementName;
        this.assignee = assignee;
        this.reviewer = reviewer;
        this.taskTypeID = taskTypeID;
        this.Date = Date;
        this.id = id;
        this.PlanFrom = PlanFrom;
        this.PlanTo = PlanTo;
    }

    public String getPlanFrom() {
        return PlanFrom;
    }

    public String getPlanTo() {
        return PlanTo;
    }

  

}
