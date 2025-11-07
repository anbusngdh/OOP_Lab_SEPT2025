/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Test {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int smallest = 100000;
        int sec_smallest = 100000;
        int x = 0;
        System.out.print("Enter a number: ");
        while((x = sc.nextInt()) != -1)
        {
            
            if(x < smallest) {
                sec_smallest = smallest;
                smallest = x; }
                else if(x < sec_smallest){
                sec_smallest = x;
                        }
             System.out.print("Enter a number: ");
        }
     
        
        System.out.println("Smallest is: " + smallest);
         System.out.println("Second Smallest is: " + sec_smallest);
    }
    
}
