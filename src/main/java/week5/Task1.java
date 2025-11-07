/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Task1 {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks or enter -1 to stop the program: ");
        
       // int marks = sc.nextInt();
        int marks = 0;
        //while((marks = sc.nextInt()) != -1) {  //evaluates true or false
        for(;(marks = sc.nextInt()) != -1;) {
        if(marks >= 60 && marks <= 100)
            System.out.println("You have passed the exam"); 
        else
            if(marks>=0 && marks < 60)
                System.out.println("You have failed the exam");
        System.out.print("Enter the marks or enter -1 to stop the program: ");
        //marks = sc.nextInt();        
        }
        
        
        if(marks == -1)
             System.out.println("No numbers are entered except 0");
        
    }
}
