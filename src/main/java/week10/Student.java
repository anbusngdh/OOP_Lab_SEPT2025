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
public class Student {
    
    private String stuId;
    private String stuName;
    
    //student --> payment
    private Payment[] payments = new Payment[10]; //static array
    //student --> address
    private ArrayList<Address> addresses = new ArrayList();  //dynamic array
    
    //other variables (keep track)
    private static int no_of_students;  //belong to class
    private int no_of_payments;  //belong to object
    private int no_of_addresses;
    
    public static void increaseStudentCount()
    {
        no_of_students++;
    }
    
    public static void decreaseStudentCount()
    {
        no_of_students--;
    }
    public static int getNoOfStudents()
    {
        return no_of_students;
    }
    public void increasePaymentCount()
    {
        no_of_payments++;
    }
    public void decreasePaymentCount()
    {
         no_of_payments--;
    }
    public int getNoOfPayments()
    {
        return no_of_payments;
    }
    public void increaseAddressCount()
    {
         no_of_addresses++;
    }
    public void decreaseAddressCount()
    {
         no_of_addresses--;
    }
    public int getNoOfAddresses()
    {
        return no_of_addresses;
    }

    public Student() {
    }

    public Student(String stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Payment[] getPayments() {
        return payments;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "Student{" + "stuId=" + stuId + ", stuName=" + stuName + '}';
    }
    
    
}
