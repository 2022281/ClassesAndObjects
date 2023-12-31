/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjects;

import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;

/**
 *
 * @author aldol
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Triangle tri1 = new Triangle();
        Triangle tri2 = new Triangle();
        Triangle tri3 = new Triangle();
        Triangle tri4 = new Triangle();
        Triangle tri5 = new Triangle();
        Triangle tri6 = new Triangle();
        
        //the lengths of tril1`s sides will be first, then the lengths of tril2`s etc.
        int [] sideLengths = new int[18]; //3x6=18
        
        sideLengths[0] = 5;
        sideLengths[1] = 8;
        sideLengths[2] = 9;
        
        //I want to specifie that triagle 5 has the sideLengths (4, 7, 2)
        sideLengths[12] = 4;
        sideLengths[13] = 7;
        sideLengths[14] = 2;
        
        //we want to set the middle side of each triangle to be 3.
        sideLengths[1] = 3;
        sideLengths[4] = 3;
        sideLengths[7] = 3;
        sideLengths[10] = 3;
        sideLengths[13] = 3;
        sideLengths[16] = 3;
        
        
        Person sam = new Person();
        sam.favTriangle = tri5;
        
        
        Rectangle rect1 = new Rectangle();
        System.out.println(rect1.getArea());
        //Shape shape1 = new Shape();
        System.out.println(rect1.getColour());
        System.out.println(tri5.getColour());
                
                
    }
    
}
