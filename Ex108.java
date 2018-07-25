/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex108;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex108 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);	
       System.out.print("Input a positive integer: ");
        int n = in.nextInt(); 
		if (n>0)
		{
           System.out.print("The single digit number is: "+(n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9)));
		}
		System.out.println("\n");  
    }
    
}
