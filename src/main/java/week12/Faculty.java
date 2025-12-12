/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

/**
 *
 * @author LENOVO
 */
public class Faculty extends Employee {
    
    private int officeHrs;
    private int rank;

    public Faculty() {
        super();
        System.out.println("Faculty object is created!");
    }

    public Faculty(String name, String address, String phoneNo, String email, String office, double salary, MyDate dateHired, int officeHrs, int rank) {
        super(name, address, phoneNo, email, office, salary, dateHired);
        this.officeHrs = officeHrs;
        this.rank = rank;
        System.out.println("Faculty object is created!");
    }

    public int getOfficeHrs() {
        return officeHrs;
    }

    public void setOfficeHrs(int officeHrs) {
        this.officeHrs = officeHrs;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" + super.toString() + 
                "officeHrs=" + officeHrs + ", "
                + "rank=" + rank + '}';
    }
    
    
    
    
    
    
    
}
