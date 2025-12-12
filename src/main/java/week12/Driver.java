/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

/**
 *
 * @author LENOVO
 */
public class Driver {
    
    public static void main(String[] args)
    {
        
        //supertype/subtype --> polymorphism
        
       // Student s1 = new Student();
        Person s1 = new Student("Sam", "1, Jln KL, KL", "019123456", "sam@gmail.com", Status.values()[2].getStatus());
        System.out.println(s1);
        Employee fac1 = new Faculty("Kenny", "1, Jln KL, KL", "019123456", "kenny@gmail.com","IT dept", 4567.89, new MyDate(2025,6,6),8,Rank.values()[0].getRank());
        System.out.println(fac1);
        Rank r = Rank.values()[0];
        System.out.println(r.name());
        
        Person[] person = new Person[2];  //polymorphism
        person[0] = s1;
        person[1] = fac1;
        for(Person p: person)
            System.out.println(p.toString());
        
    }
    
    
}
