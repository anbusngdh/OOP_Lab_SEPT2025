/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args)
    {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String line = sc.nextLine();
        char c = line.charAt(0);
        System.out.println("The ASCII number is: " + (int)c);
        */
        
       // double x = Math.random();  // 0.0  --> < 1.0
      //  System.out.println(x);
        
      //  double y = x * 10;
      //  System.out.println(y);
        
    //    int a = (int)(Math.random() * 10) + 1;  // 1 --> 10
     //   System.out.println(a);
        
        String s = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);
        System.out.println("Random number is: " + s);
        
        int a = Integer.parseInt(s);
        System.out.println("The character is: " + (char)a);
        
        
        
    }
    
}
