/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author LENOVO
 */
public class Task2 {
    
    public static void main(String[] args)
    {
        System.out.println("Celsius\t\t\tFahrenheit");
        int i = 0;
        //while(i <=100){
       // for( ;i <=100; )  //i = i + 2
        do{
            System.out.printf("%d\t\t\t%.1f", i, ((i * 9/5.0) + 32));
            System.out.println();
            i+=2;
        }while(i <=100);
    }
    
}
