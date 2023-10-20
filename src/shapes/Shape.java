/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author aldol
 */
public abstract class Shape {
    
   private boolean isFilled = true;
   private String colour = "Yellow";
   
   public boolean getisIsFilled() {
       return isFilled;
   }
   
   public void setIsfilled(boolean isFilled) {
       this.isFilled = isFilled;
   }
   
   public String getColour() {
       return colour;
   }
   
   public void setColour(String colour) {
       this.colour = colour;
   }
}
