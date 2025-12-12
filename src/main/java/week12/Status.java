/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package week12;

/**
 *
 * @author LENOVO
 */
public enum Status {
    
    FRESHMAN(1), SOPHOMORE(2), JUNIOR(3), SENIOR(4);
    
    
    private int status;
    
    private Status(int status)
    {
        this.status = status;
        System.out.println(this.status);
    }
    
    public int getStatus()
    {
        return this.status;
    }
    
}
