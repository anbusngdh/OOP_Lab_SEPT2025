/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10;

/**
 *
 * @author LENOVO
 */
public class Driver {

    public static void main(String[] args) {
        Controller c = new Controller();

        Student stu1 = new Student("1", "Sam");
        Student stu2 = new Student("2", "Jerry");

        //add student
        c.addStudent(stu1);
        c.addStudent(stu2);
        System.out.println(Controller.getNoOfStudents());  //2

        //add Payment
        c.addPayment(stu1, new Payment(100, "Semester 1", "23/6/2025"));
        c.addPayment(stu2, new Payment(200, "Semester 1", "12/5/2025"));
        c.addPayment(stu1, new Payment(300, "Semester 2", "3/8/2025"));
        System.out.println(c.getNoOfPayments(stu1));  //2
        System.out.println(c.getNoOfPayments(stu2));  //1
        //add address
        c.addAddress(stu1,new Address("1, Jln Selangor", "Selangor"));
         c.addAddress(stu1,new Address("11, Jln Perak", "Perak"));
          System.out.println(c.getNoOfAddresses(stu1));  //2
          c.removeAddress(stu1, Controller.getStudents().get(0).getAddresses().get(0));
           System.out.println(c.getNoOfAddresses(stu1));
           //display all the payment details for stu1
           for(Payment p: Controller.getStudents().get(0).getPayments())
               if(p != null)
                   System.out.println(p);
           
           
    }

}
