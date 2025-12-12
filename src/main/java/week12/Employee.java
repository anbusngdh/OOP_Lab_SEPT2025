/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

/**
 *
 * @author LENOVO
 */
public class Employee extends Person {
    
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee() {
        super();
         System.out.println("Employee object is created!");
    }

    public Employee(String name, String address, String phoneNo, String email,String office, double salary, MyDate dateHired) {
        super(name, address, phoneNo, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
        System.out.println("Employee object is created!");
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + 
                "office=" + office + ", "
                + "salary=" + salary + ", "
                + "dateHired=" + dateHired + '}';
    }
    
    
    
    
    
    
}
