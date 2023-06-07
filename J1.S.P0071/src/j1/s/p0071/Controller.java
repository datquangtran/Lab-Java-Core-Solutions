/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Controller {
    ArrayList<Task> task = new ArrayList<Task>();

    //them thong tin 1 task vao tap hop
    public int addTask(String requirementName, String assignee, String Reviewer, String taskTypeID, String expertdate, String planFrom, String planTo) {
        int id=1;
        try {
            //neu task rong thi id=1
            
            if(task.size()==0) id=1;
            else id=task.get(task.size()-1).getId()+1;
            //khai bao bien t theo model Task
            Task t = new Task(requirementName, assignee, Reviewer, taskTypeID, expertdate, id, planFrom, planTo);
            //them phan tu t vao tap hop
            task.add(t);
        //neu tap hop khong ton tai
        } catch (NullPointerException ex) {
            System.out.println("Database does not exist");
        //neu co loi voi nhung bai ghi dang so
        } catch (NumberFormatException ex) {
            System.out.println("Wrong number format");
        }
        //tra ve id task
        return id;
    }
    //xoa thong tin 1 task trong tap hop
    public void deleteTask(int id) {
        //neu id nho hon 1 thi in ra thong bao va ket thuc ham
        if (id <1) {
            System.out.println("Data does not exist");
            return;
        }
        try {
            //duyet tung phan tu trong tap hop
            for (int i = 0; i < task.size(); i++) {
                //khai bao bien s chia id phan tu dang duyet den
                int s = task.get(i).getId();
                //neu id can tim bang s thi xoa phan tu do va ket thuc ham
                if (s==id) {
                    task.remove(i);
                    return;
                }
            }
            //neu id khong ton tai trong tap hop
            System.out.println("Id doesn't exist in the Database");
            return;
        //neu tap hop khong ton tai hoac chay qua so phan tu cua tap hop    
        } catch (NullPointerException ex) {
            System.out.println("Database does not exist");
        //neu co loi voi nhung bai ghi dang so
        } catch (NumberFormatException ex) {
            System.out.println("Wrong number format");
        }
    }
    //hien thong tin toan bo trong tap hop
    public void showTask() {
        try {
            //duyet tung phan tu trong tap hop, voi moi phan tu thi in ra theo dinh dang phia duoi
            for (int i = 0; i < task.size(); i++) {
                System.out.printf("%-3d %-15s %-10s %-10s %-10.1f %-15s %-15s\n", task.get(i).getId(), task.get(i).getRequirementName(), task.get(i).getTaskTypeID(), task.get(i).getDate(),Float.valueOf(task.get(i).getPlanTo())-Float.valueOf(task.get(i).getPlanFrom()), task.get(i).getAssignee(), task.get(i).getReviewer());
            }
        //neu tap hop khong ton tai hoac chay qua so phan tu cua tap hop    
        } catch (NullPointerException ex) {
            System.out.println("Database does not exist");
        //neu co loi voi nhung bai ghi dang so
        } catch (NumberFormatException ex) {
            System.out.println("Wrong number format");
        }
    }
}
