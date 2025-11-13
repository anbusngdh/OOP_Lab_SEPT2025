/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

/**
 *
 * @author LENOVO
 */
public class Task2 {
    
    public static void main(String[] args)
    {
        int key = 45;
        LinearSearch.inputArray2D();
        String results = LinearSearch.linearSearch2D(key);
        if(results.contains("-1"))
            System.out.println("Value: "+ key + " is not found");
        else
            System.out.println("Value: "+ key + " is found " + results);
        
        
    }
    
}
