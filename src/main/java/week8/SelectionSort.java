/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

/**
 *
 * @author LENOVO
 */
public class SelectionSort {
    
    public static void selectionSortDescending(int[] arr)
    {
        int size = arr.length;  //10, 0 --> 9
        
        for(int i = 0; i < size; i++)  //control passes
        {
            int index = i; //to hold the index -- smallest/largest
            
            for(int j = i+1; j < size; j++)  //find smallest/largest
            {
                if(arr[j] < arr[index])
                    index = j;
            }
            
            if(index != i)
            {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
            
            
        }
    }
    
    
    
}
