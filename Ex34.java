/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex34;
import java.util.*;
import java.math.*;

/**
 *
 * @author Karthikeyan
 */
public class Ex34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int side,n;
        double area,pi=3.14,rad,degree,por;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the sides of the hexagon=");
        side=s.nextInt();
        //n=s.nextInt();
        degree=pi/6;
        rad=Math.tan(pi/6);
        por=Math.pow(side,2);
        area= (6*por)/(4*rad);
        System.out.println("The Area of Hexagon is "+area);
        
        
        
    }
    
}
