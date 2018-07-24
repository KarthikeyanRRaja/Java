/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex65;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the A value= ");
        int a = in.nextInt();  
		System.out.print("Enter the B value= ");
		int b = in.nextInt(); 
		int divided = a / b;
		int remainder = a - (divided * b);
		System.out.println(remainder); 
    }
    
}
