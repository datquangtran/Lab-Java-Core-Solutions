/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Task;
import java.util.ArrayList;
import java.util.List;
import util.Validation;

/**
 *
 * @author HP
 */
public class TaskBo {

    private Validation check = new Validation();
    private List<Task> list;

    String[] taskType = {"Code", "Test", "Design", "Review"};

    public TaskBo() {
        this.list = new ArrayList<>();

    }

    public TaskBo(List<Task> list) {
        this.list = list;
    }

    public void showmenuTask() {
        System.out.println("---Task type----");
        System.out.println("1: Code");
        System.out.println("2: Test");
        System.out.println("3: Design");
        System.out.println("4: Review");
    }

    public boolean add() {
        Task t = new Task();
        System.out.println("===============Add Task==============");
        for (int i = list.size() - 1; i >= 0; i--) {
            t.setID(this.list.get(i).getID() + 1);
            break;
        }
        showmenuTask();
        int index = check.getInt("Enter your choice", 1, 4);
        t.setTaskTypeId(taskType[index - 1]);
        t.input();
        t.setTime(t.getPlanTo() - t.getPlanFrom());
        System.out.println("Add Successfully");
        return this.list.add(t);

    }

    public void display() {
        System.out.println("==================  Task  =====================");
        if (this.list.isEmpty()) {
            System.out.println("List empty!");
        } else {
            System.out.println("ID\tName\t\t\tTask Type\tDate\t\tTime\t\tAssignee\tReviewer");
            this.list.forEach(System.out::println);
        }
    }

    public void delete() {
        System.out.println("-------------Delete Task-------------");
        if (this.list.isEmpty()) {
            System.out.println("List empty!");
        } else {
            int code = check.getInt("Enter ID to remove:", 1, Integer.MAX_VALUE);
            boolean control = false;
            for (int i = this.list.size() - 1; i >= 0; --i) {
                if (this.list.get(i).getID() == code) {
                    control = true;
                    this.list.remove(i);
                    resetID();
                }
            }
            if (control) {
                System.out.println("Remove successfully!");
            } else {
                System.out.println("ID doesnt exist");
            }

        }
    }

    public void resetID() {
        for (int i = 0; i < this.list.size(); i++) {
            this.list.get(i).setID(i + 1);
        }
    }

}
