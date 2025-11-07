/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author 112554
 */

import java.util.Scanner;
public class Task2 {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String nextcolor = "";
        System.out.print("Enter code [1-3]: ");
        byte code = sc.nextByte();
        /*
        if(code == 1)
            nextcolor = "Green";
        else if(code == 2)
            nextcolor = "Yellow";
        else if(code == 3)
            nextcolor = "Red";
        else
            nextcolor = "Invalid/Unknown";
        */
        //rule switch
   nextcolor = switch(code)
        {
            case 1 -> "Green";
            //break;  //fall through case
            case 2 ->  "Yellow";
            //break;
            case 3,4 -> {
           yield "Red"; }
            //break;
            default ->  "Invalid/Unknown";
            //break;
        };
        System.out.println("The next color is: "+ nextcolor);
        
        
    }
    
}
