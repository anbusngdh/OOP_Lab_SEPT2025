/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author LENOVO
 */
public class OddEven {
    
    //data (information)
    private int odd;
    private int even;
    private int[] num = new int[16];
    
    //methods
    //special method = constructor
    public OddEven()
    {
        
    }
    //
    public void generateRandomNumbers()
    {
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)((Math.random() * 100) + 1);
        }
    }
    
    public  void determineOddEvenDigits() {
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }       
    }
    
    public void displayGeneratedNumbers()
    {
        for (int i = 0; i < num.length; i++)
            System.out.print("" + num[i] + " ");
    }
    
    @Override
    public String toString()
    {
         return "Total even numbers: " + even + "\nTotal odd numbers: " + odd;
    }
    
    
    
}
