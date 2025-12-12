/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

/**
 *
 * @author LENOVO
 */
public class Staff extends Employee {
    
    private String title;

    public Staff() {
        super();
        System.out.println("Staff object is created!");
    }

    public Staff(String name, String address, String phoneNo, String email, String office, double salary, MyDate dateHired,String title) {
        super(name, address, phoneNo, email, office, salary, dateHired);
        this.title = title;
        System.out.println("Staff object is created!");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() + 
                "title=" + title + '}';
    }
    
    
    
}
