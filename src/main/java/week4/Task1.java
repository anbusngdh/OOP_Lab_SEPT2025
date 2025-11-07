/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
import java.math.BigDecimal;

public class Task1 {
    
    public static void main(String[] args)
    {
        
        final double deg = 180.0;  //constant variable       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = sc.nextInt();
        System.out.print("Enter the length of the side: ");
        double s = sc.nextDouble();
        
        BigDecimal area = BigDecimal.valueOf((n * Math.pow(s, 2)) /(4 * Math.tan(Math.toRadians(deg/n))));
        
        System.out.printf("The area is: %.2f", area);
        
        
        //floating point error
      //  double x = 4.5+ 5.47;
      //  System.out.println(x);
        
       // BigDecimal val1 = new BigDecimal("4.5");
       // BigDecimal val2 = new BigDecimal("5.47");
       //  BigDecimal val3 = val1.add(val2);
       //  System.out.println(val3);
        
        
    }
    
}
