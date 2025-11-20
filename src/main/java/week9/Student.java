/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author LENOVO
 */
//domain class/entity class
public class Student {

    //instance/object variables
    private String name;
    private int age;
    private double marks;

    //class variables - belong to class
    private static int no_of_students;

    private static Student[] students = new Student[10];

    //methods 
    //constructors
    //default
    public Student() {

    }

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    //setters and getters
    public String getName() //getter
    {
        return this.name;
    }

    public void setName(String name) //setter
    {
        this.name = name;
    }

    public int getAge() //getter
    {
        return this.age;
    }

    public void setAge(int age) //setter
    {
        this.age = age;
    }

    public double getMarks() //getter
    {
        return this.marks;
    }

    public void setMarks(double marks) //setter
    {
        this.marks = marks;
    }
//display the content of the object

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + " Marks: " + marks;
    }

    //other methods
    public static int getNoOfStudents() {
        return no_of_students;
    }

    public static Student[] getStudents() {
        return students;
    }

    public static void increaseStudentCount() {
        no_of_students++;
    }

    public static void decreaseStudentCount() {
        no_of_students--;
    }
}
