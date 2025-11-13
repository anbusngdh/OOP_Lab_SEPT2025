/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class LinearSearch {
    
    //data
    private static final int ROWS = 3;
    private static final int COLS = 3;    
    private static int[][] arr = new int[ROWS][COLS];
    
    
    //methods
    public static void inputArray2D()
    {
        Scanner sc  =new Scanner(System.in);
        System.out.println("---Entering " + ROWS + "x" + COLS + " Array Values---");
        
        for(int i = 0; i < ROWS; i++) {
            System.out.println("Enter " + COLS + "integers for Row " + (i+1) + ":");
            for(int j = 0; j < COLS; j++) {
                System.out.print("R" + (i+1) + " C" + (j+1) + ":");
                arr[i][j] = sc.nextInt(); }
        }
    
    }
    
    public static String linearSearch2D(int key)
    {
        for(int i = 0; i < ROWS; i++) 
            for(int j = 0; j < COLS; j++)
                if(arr[i][j] == key)
                    return "Row at: " + (i+1) + " Col at: " + (j+1);
     
        return "-1";
    }
    
}
