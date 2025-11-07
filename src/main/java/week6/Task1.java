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
public class Task1 {
    public static void main(String[] a)
    {
        
        String s = inputNum();
        reverseDigits(s);
      //  Scanner sc = new Scanner(System.in);
      //  System.out.print("Enter an integer: ");
      //  String s = sc.nextLine();
       // int rep = s.length() - 1;  //1234 --> 4
        //int num = Integer.parseInt(s);
        
     //   int i = rep;  //control variable
      //  while(i >= 0)
      //  {
       //     System.out.print("" + s.charAt(i) + " ");
           // System.out.print("" + (num % 10) + " ");
           // num = num / 10;
            
          //  i++;
       //     i--;
       // }
        
        
        
    }
    
    public static String inputNum()
    {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return sc.nextLine();
    }
    
    public static void reverseDigits(String s)
    {
          int rep = s.length() - 1;  //1234 --> 4
        //int num = Integer.parseInt(s);
        
        int i = rep;  //control variable
        while(i >= 0)
        {
            System.out.print("" + s.charAt(i) + " ");
           // System.out.print("" + (num % 10) + " ");
           // num = num / 10;
            
          //  i++;
            i--;
        }
    }
    
    
}
