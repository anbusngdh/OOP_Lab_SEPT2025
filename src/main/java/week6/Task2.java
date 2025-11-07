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

public class Task2 {

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

      //  System.out.print("Enter three integer numbers: ");

       // int num1 = sc.nextInt();
       // int num2 = sc.nextInt();
       // int num3 = sc.nextInt();
       
       String s1 = inputNum();
       Scanner s = new Scanner(s1);
       s.useDelimiter(":");
       int num1 = Integer.parseInt(s.next());
       int num2 = Integer.parseInt(s.next());
       int num3 = Integer.parseInt(s.next());
       
       /*
        int largest = 0;
        if(num1 > num2 && num1 > num3)
            largest = num1;
        else if(num2 > num1 && num2 > num3)
             largest = num2;
        else
             largest = num3;
        
        int smallest = 0;
        if(num1 < num2 && num1 < num3)
            smallest = num1;
        else if(num2 < num1 && num2 < num3)
             smallest = num2;
        else
             smallest = num3;
        
        int s_largest = 0;
        if(num1 > smallest && num1 < largest)
           s_largest = num1;
        else if(num2 > smallest && num2 < largest)
             s_largest = num2;
        else
             s_largest = num3;

*/

    }
    
    
    public static String inputNum()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three integer numbers: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        return num1 + ":" + num2 + ":" + num3;
        
    }
    
    public static String sortDigits(int num1, int num2, int num3)
    {
         int largest = 0;
        if(num1 > num2 && num1 > num3)
            largest = num1;
        else if(num2 > num1 && num2 > num3)
             largest = num2;
        else
             largest = num3;
        
        int smallest = 0;
        if(num1 < num2 && num1 < num3)
            smallest = num1;
        else if(num2 < num1 && num2 < num3)
             smallest = num2;
        else
             smallest = num3;
        
        int s_largest = 0;
        if(num1 > smallest && num1 < largest)
           s_largest = num1;
        else if(num2 > smallest && num2 < largest)
             s_largest = num2;
        else
             s_largest = num3;
        
        return largest + " " + s_largest + " " + smallest;
    }
    
    public static void displaySortedDigits(String out)
    {
        System.out.println(out);
    }
}
