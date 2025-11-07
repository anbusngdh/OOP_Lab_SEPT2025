/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author 112554
 */
import java.util.Scanner;
public class Task1 {
    
    public static void main(String[] args)
    {
        //static infer type vs dynamic infer type
        //double amt_water, initial_temp, final_temp;
        //amt_water = initial_temp = final_temp = 0.0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter amount of water in kg: ");
        var amt_water = sc.nextDouble();
        //double amt_water = sc.nextDouble();
        
        
        System.out.print("Please enter initial temperature: ");
        var initial_temp = sc.nextDouble();
        //double initial_temp = sc.nextDouble();
        
        System.out.print("Please enter final temperature: ");
        var final_temp = sc.nextDouble();
        //double final_temp = sc.nextDouble();
        
        
        double energy = amt_water * (final_temp - initial_temp) * 4184;
        
        
        //String results = String.format("The energy needed is: %.2f", amt_water * (final_temp - initial_temp) * 4184);
        String results = String.format("The energy needed is: %.2f", energy);
        
        System.out.println(results);
       

        // System.out.println("The energy needed is: " + (amt_water * (final_temp - initial_temp) * 4184));
        
        //printf
        //System.out.printf("The energy needed is: %.2f", amt_water * (final_temp - initial_temp) * 4184);
        
        
    }
    
}
