/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex63;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the A and B value=");
        a=s.nextInt();
        b=s.nextInt();
        if(a>b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
        if(a==b)
        {
            System.out.println("0");
        }
        int r1=a%6;
        int r2=b%6;
        if(r1==r2)
        {
            if(a>b)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(b);
            }
        }
    }
    
}
