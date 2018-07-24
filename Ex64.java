/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex64;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the A and B value=");
        a=s.nextInt();
        b=s.nextInt();
        if((a>=25)&&(a<=75))
        {
            System.out.println("HI");
        }
        else
        {
            System.out.println("Please enter between 25 to 75");
        }
        int r1=a%10;
        int r2=b%10;
        if(r1==r2)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
    
}
