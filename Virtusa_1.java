/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtusa_1;
import java.io.*;
import java.util.*;

/**
 *
 * @author Karthikeyan
 */
interface area
{
   // Float f=new Float(3.14);
    public float pi=3.14f;
}
public class Virtusa_1 implements area{

    /**
     * @param args the command line arguments
     */
    public static float circle(int rad)
    {
        float area;
        area=pi*rad*rad;
        return area;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int rad;
        System.out.println("Enter the Radius of the circle=");
        rad=s.nextInt();
        float area=circle(rad);
        System.out.println("Area of the circle= "+area);
    }
    
}
