/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

/**
 *
 * @author LENOVO
 */
public class Student extends Person {
    
    private int status;

    public Student() {
        super();
         System.out.println("Student object is created!");
    }

    public Student(String name, String address, String phoneNo, String email, int status) {
        super(name, address, phoneNo, email);
        this.status = status;
        System.out.println("Student object is created!");
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + 
                "status=" + status + '}';
    }
   
    
    
}
