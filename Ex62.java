/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex62;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the A,B and C value=");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if((a==b)||(a==c)||(b==c))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
    
}
