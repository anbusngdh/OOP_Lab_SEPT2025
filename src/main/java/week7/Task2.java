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
public class Task2 {
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        double[][] matrix1 = new double[2][2];
         double[][] matrix2 = new double[2][2];
         double[][] matrix3 = new double[2][2];
         
      //   System.out.println(matrix1.length + " " + matrix1[0].length);
         
      //input matrix 1
      System.out.print("Please enter input for matrix 1: ");
      for(int i = 0; i < matrix1.length; i++) // control rows
          for(int j = 0; j < matrix1[1].length; j++)
              matrix1[i][j] = sc.nextDouble();
      System.out.println();
      //input matrix 2
      System.out.print("Please enter input for matrix 2: ");
      for(int i = 0; i < matrix1.length; i++) // control rows
          for(int j = 0; j < matrix1[1].length; j++)
              matrix2[i][j] = sc.nextDouble();
      //addition
      for(int i = 0; i < matrix1.length; i++) // control rows
          for(int j = 0; j < matrix1[1].length; j++)
              matrix3[i][j] =    matrix1[i][j] + matrix2[i][j];
      //display matrix 3 - write some codes...
      
    }
}
