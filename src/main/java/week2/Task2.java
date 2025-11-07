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
import javax.swing.JOptionPane;



public class Task2 {
    public static void main(String[] args)
    {
        
        String s = JOptionPane.showInputDialog("Please enter 3 digit number");
        short n = Short.parseShort(s);
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Please enter 3 digit number");
        //short n = sc.nextShort();
        
        short third_digit = (short)(n % 10);  //explicit casting, 932 --> 2
        n = (short)(n  /10);  //932 --> 93
        short second_digit = (short)(n % 10); // 93 --> 3
        n = (short)(n  /10); // 93 --> 9
        
        //System.out.println("The value is: " + n * second_digit * third_digit);
        
        JOptionPane.showMessageDialog(null,"The value is: " + n * second_digit * third_digit );
        
        
        
    }
    
    
    
}
