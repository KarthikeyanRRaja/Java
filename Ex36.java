/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex36;

import java.util.Scanner;

/**
 *
 * @author Karthikeyan
 */
public class Ex36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radius,x1,x2,y1,y2,dist,x1sin,x2sin,x1cos,x2cos,y;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of the EARTH=");
        radius=s.nextDouble();
        System.out.println("Enter the lattitude 1=");
        x1=s.nextDouble();
        x1=Math.toRadians(x1);
        System.out.println("Enter the longitude 1=");
        x2=s.nextDouble();
        x2=Math.toRadians(x2);
        System.out.println("Enter the latitude 2=");
        y1=s.nextDouble();
        y1=Math.toRadians(y1);
        System.out.println("Enter the longitude 2=");
        y2=s.nextDouble();
        y2=Math.toRadians(y2);
        x1sin=Math.sin(x1);
        x2sin=Math.sin(x2);
        x1cos=Math.cos(x1);
        x2cos=Math.cos(x2);
        y=Math.cos(y1-y2);
        dist=radius*(Math.acos((x1sin*x2sin)+(x1cos*x2cos)*y));
       
        System.out.println("The Distance between points is "+dist);
        
    }
    
}
