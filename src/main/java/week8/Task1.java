/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8;

/**
 *
 * @author LENOVO
 */
public class Task1 {
    public static void main(String[] a)
    {
        
        int[] data = {64, 25, 12, 22, 11, 88, 33, 99, 44, 55 };
        
        SelectionSort.selectionSortDescending(data);
        
        System.out.println("Sorted arrays: " + java.util.Arrays.toString(data));
        
    }
}
