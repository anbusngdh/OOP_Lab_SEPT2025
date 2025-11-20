/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author LENOVO
 */
public class DriverRect {
    public static void main(String[] agrs)
    {
        Rectangle rec1 = new Rectangle("Rect 1", 2, 20);
        Rectangle rec2 = new Rectangle("Rect 2", 3, 30);
        
        System.out.println(rec1 + "\n" +
                rec1.getArea() + "\n" + 
                rec1.getPerimeter());
        
         System.out.println(rec2 + "\n" +
                rec2.getArea() + "\n" + 
                rec2.getPerimeter());
    }
}
