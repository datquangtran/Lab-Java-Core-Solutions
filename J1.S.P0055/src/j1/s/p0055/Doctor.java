/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0055;

/**
 *
 * @author ASUS
 */
public class Doctor {

    String Code, Name, Specialization;
    int Availability;

    public Doctor() {
    }

    public Doctor(String Code, String Name, String Specialization, int Availability) {
        this.Code = Code;
        this.Name = Name;
        this.Specialization = Specialization;
        this.Availability = Availability;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        if (Code != null) {
            this.Code = Code;
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        if (Name != null) {
            this.Name = Name;
        }
    }

    public String getSpecialization() {
        return Specialization;
    }
    //thay doi Specialization
    public void setSpecialization(String Specialization) {
        //neu xau ki tu can thay khac null thi thay doi gia tri
        if (Specialization != null) {
            this.Specialization = Specialization;
        }
    }

    public int getAvailability() {
        return Availability;
    }
    //thay doi Availability
    public void setAvailability(int Availability) throws Exception {
        //neu so can thay la so duong thi thay doi gia tri
        if (Availability >= 0) {
            this.Availability = Availability;
        //neu dau vao khong phai la so
        } else {
            throw new Exception("Must be a positive integer");
        }
    }
}
