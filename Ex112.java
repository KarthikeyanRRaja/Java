/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex112;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);	
		System.out.print("Input a number: ");
	    int n = in.nextInt(); 
        int n1 = n;
		long ctr = 0;
		while (n != 0) 
		{
			ctr += n / 5;
			n /= 5;
		}
		System.out.printf("Number of trailing zeros of the factorial %d is %d ",n1,ctr);
		System.out.printf("\n");      	   
    }
    
}
