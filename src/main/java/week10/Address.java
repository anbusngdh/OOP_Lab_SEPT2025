/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10;

/**
 *
 * @author LENOVO
 */
public class Address {
    private String streetName;
    private String state;

    public Address() {
    }

    public Address(String streetName, String state) {
        this.streetName = streetName;
        this.state = state;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" + "streetName=" + streetName + ", state=" + state + '}';
    }
    
    
    
}
