/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex92;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a=new int[5];
        int evec=0,oddc=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 5 values=");
        for(int i=0;i<5;i++)
        {
            a[i]=s.nextInt();
            if(a[i]%2==0)
            {
                evec++;
            }
            else
            {
                oddc++;
            }
        }
        System.out.println("No of Even Numbers="+evec);
        System.out.println("No of Odd Numbers="+oddc);
    }
    
}
