/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex35;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int side,n;
        double area,pi=3.14,rad,degree,por;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the sides and lenght of the polygon=");
        side=s.nextInt();
        n=s.nextInt();
        //degree=pi/n;
        rad=Math.tan(pi/side);
        por=Math.pow(n,2);
        area= (side*por)/(4*rad);
        System.out.println("The Area of Polygon is "+area);
        
    }
    
}
