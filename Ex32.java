/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex32;
import java.util.*;

/**
 *
 * @author Karthikeyan
 */
public class Ex32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        System.out.println("Enter the A and B value=");
       Scanner s=new Scanner(System.in);
       a=s.nextInt();
       b=s.nextInt();
       if(a==b)
           System.out.println(a+"=="+b);
       if(a!=b)
           System.out.println(a+"!="+b);
       if(a<=b)
           System.out.println(a+"<="+b);
       if(a>=b)
           System.out.println(a+">="+b);
    }
    
}
