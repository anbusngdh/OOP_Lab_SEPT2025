/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author LENOVO
 */
public class ServiceStudent {

    public void addStudent(Student s) {
        System.out.println("Adding student!");
        Student.getStudents()[Student.getNoOfStudents()] = s;
        Student.increaseStudentCount();

    }

    public String removeStudent(String name) {
        //linear search
        int index = -1;
        for (int i = 0; i < Student.getStudents().length; i++) {
            if (Student.getStudents()[i] != null) {
                if (Student.getStudents()[i].getName().equals(name)) {
                    index = i;
                    break;
                }
            }
        }

        if (index != -1) {
            Student.getStudents()[index] = null;
            Student.decreaseStudentCount();
            return "Name: " + name + " is removed successfully";
        } else {
            return "Name: " + name + " is not found";
        }

    }

    public int getTotalStudents() {
        return Student.getNoOfStudents();
    }

}
