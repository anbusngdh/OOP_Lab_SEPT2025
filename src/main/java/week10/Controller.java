/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
public class Controller {
    
    
    private static ArrayList<Student> students = new ArrayList(); 

    public static ArrayList<Student> getStudents() {
        return students;
    }
    
    //add student
    public void addStudent(Student s)
    {
        students.add(s);
        Student.increaseStudentCount();
                
    }
    
    //add payment
    public void addPayment(Student s1, Payment p)
    {
        //student --> payment
        s1.getPayments()[s1.getNoOfPayments()] = p;
        //payment --> student
        p.setStudent(s1);  //payment --> student
        s1.increasePaymentCount();        
    }
    
    //add address
    public void addAddress(Student s1, Address a)
    {
        s1.getAddresses().add(a);
        s1.increaseAddressCount();
    }
    
    //remove address
    public void removeAddress(Student s1, Address a)
    {
        s1.getAddresses().remove(a);
        s1.decreaseAddressCount();
    }
    
    public static int getNoOfStudents()
    {
        return Student.getNoOfStudents();
    }
    
    public int getNoOfPayments(Student s)
    {
        return s.getNoOfPayments();
    }
    public int getNoOfAddresses(Student s)
    {
        return s.getNoOfAddresses();
    }
    
}
