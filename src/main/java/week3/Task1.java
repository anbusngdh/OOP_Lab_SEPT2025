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
public class Task1 {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String color ="";
        System.out.print("Enter wavelength [380-749]: ");
        double w_length = sc.nextDouble();
        
        //explicit range vs implicit range
        /*
        if(w_length >= 380 && w_length < 450) 
            color = "Violet";
        else if(w_length >= 450 && w_length < 495) 
            color = "Blue";
        else if(w_length >= 495 && w_length < 570) 
            color = "Green";  
        else if(w_length >= 570 && w_length < 590) 
            color = "Yellow";
        else if(w_length >= 590 && w_length < 620) 
            color = "Orange";
        else if(w_length >= 620 && w_length < 750) 
            color = "Red";  
        else
            color = "Unknown/Invalid";
        */
        
        
        //implicit range
        /*
       if(w_length < 750 && w_length >= 380){
        if(w_length >= 620)
            color = "Red";
        else if(w_length >= 590)
             color = "Orange";
        else if(w_length >= 570)
             color = "Yellow";
        else if(w_length >= 495)
             color = "Green";
        else if(w_length >= 450)
             color = "Blue";
        else
            color = "Violet";
       }else
           color = "Unknown/Invalid";
        */
        
        if(w_length >= 380 && w_length < 450) 
            color = "Violet";
         if(w_length >= 450 && w_length < 495) 
            color = "Blue";
         if(w_length >= 495 && w_length < 570) 
            color = "Green";  
         if(w_length >= 570 && w_length < 590) 
            color = "Yellow";
         if(w_length >= 590 && w_length < 620) 
            color = "Orange";
         if(w_length >= 620 && w_length < 750) 
            color = "Red"; 
        
        
        
        
        System.out.println("The color is: " + color);
    }
    
    
}
