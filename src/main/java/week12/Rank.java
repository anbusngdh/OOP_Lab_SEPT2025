/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package week12;

/**
 *
 * @author LENOVO
 */
public enum Rank {
    
    LECTURER(1), SENIOR_LECTURER(2), ASSOCIATE_PROFESSOR(3), PROFESSOR(4);
    
    private int rank;
    
    private Rank(int rank)
    {
        this.rank = rank;
    }
    
    public int getRank()
    {
        return this.rank;
    }
            
    
    
    
    
    
}
