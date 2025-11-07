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
public class Task3 {
    public static void main(String[] args)
    {
        
       // System.out.println("Malaysia".compareTo("Malaysia"));
        
        // + , - , 0
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st country: ");
        String country1 = sc.nextLine();
        System.out.print("Enter the 2nd country: ");
        String country2 = sc.nextLine();
        System.out.print("Enter the 3rd country: ");
        String country3 = sc.nextLine();
        
        
        if(country1.compareTo(country2) > 0 && country1.compareTo(country3)> 0)
            if(country2.compareTo(country3) > 0)
                System.out.println(country1 + " " + country2 + " " + country3);
             else
                System.out.println(country1 + " " + country3 + " " + country2);
                
            
            
        
        
        
    }
}
