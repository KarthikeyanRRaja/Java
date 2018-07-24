/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex53;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the A Value : ");
        int a = s.nextInt();  
		System.out.print("Enter the B value: ");
		int b = s.nextInt(); 
		System.out.print("Enter the C value : ");
        int c= s.nextInt(); 
        System.out.print("The Answer is: "+kar(a, b, c,true));
		System.out.print("\n");
    }
   
    public static boolean kar(int p, int q, int r, boolean xyz)
     {
	     return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
     }
    }
    

