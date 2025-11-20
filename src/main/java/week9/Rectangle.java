/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author LENOVO
 */
public class Rectangle {
    
    private String name;
    private double width;
    private double height;
    
    //methods

    public Rectangle() {
        width = 1;
        height = 1;
        name = "default";
    }

    public Rectangle(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "name=" + name + ", width=" + width + ", height=" + height + '}';
    }
    
    public double getArea()
    {
        return width * height;
        
    }
    
    public double getPerimeter()
    {
        return 2 * (width + height);
    }
}
