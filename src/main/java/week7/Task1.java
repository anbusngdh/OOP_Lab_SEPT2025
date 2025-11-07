/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
      
           OddEven obj1 = new OddEven();
           obj1.generateRandomNumbers();
           obj1.determineOddEvenDigits();
           obj1.displayGeneratedNumbers();
           System.out.println();
           System.out.println(obj1);
           
           OddEven obj2 = new OddEven();
           obj2.generateRandomNumbers();
           obj2.determineOddEvenDigits();
           obj2.displayGeneratedNumbers();
           System.out.println();
           System.out.println(obj2);
           
//  Scanner sc = new Scanner(System.in);
      //  int num[] = new int[16];  //static array vs dynamic array

      //  System.out.print("Please enter 16 integer numbers: ");
        //inputting
      //  for (int i = 0; i < num.length; i++) {
      //      num[i] = sc.nextInt();
      //  }
       // determineOddEvenDigits(num);
        //test - display values
        // for(int i = 0; i < num.length; i++ )
        //    System.out.print("" + num[i] + " ");
        /*
        int odd, even;
        odd = even = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Total even numbers: " + even + "\nTotal odd numbers: " + odd);
*/
    }

    public static void determineOddEvenDigits(int[] num) {
        int odd, even;
        odd = even = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Total even numbers: " + even + "\nTotal odd numbers: " + odd);
    }

}
