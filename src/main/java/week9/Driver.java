/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author LENOVO
 */
public class Driver {

    ServiceStudent s_student = new ServiceStudent();
    public static void main(String[] args) {
        ServiceStudent s_student = new ServiceStudent();
        s_student.addStudent(new Student("Sam", 24, 56));
        s_student.addStudent(new Student("Jerry", 34, 76));
        System.out.println(s_student.getTotalStudents());
        System.out.println(s_student.removeStudent("Sam1"));
        System.out.println(s_student.getTotalStudents());
        //display - for each loop
        for (Student s : Student.getStudents()) {
            if (s != null) {
                System.out.println(s);
            }
        }

        //pass or fail
        for (int i = 0; i < Student.getStudents().length; i++) {
            if (Student.getStudents()[i] != null) {
                if (Student.getStudents()[i].getMarks() >= 60) {
                    System.out.println(Student.getStudents()[i].getName()
                            + " You have passed the exam");
                } else {
                    System.out.println(Student.getStudents()[i].getName()
                            + " You have failed the exam");
                }
            }
        }
    }
}
