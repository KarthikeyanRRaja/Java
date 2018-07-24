/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex57;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex57 {

    /**
     * @param args the command line arguments
     */
    public static int result(int num) {	
		int ctr = 0;
        for(int i=1; i<=(int)Math.sqrt(num); i++) {
            if(num%i==0 && i*i!=num) {
                ctr+=2;
            } else if (i*i==num) {
                ctr++;
            }
        }
        return ctr;
	}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
      System.out.print("Input an integer: ");
      int x = in.nextInt(); 

		System.out.println(result(x));
    }
    
}
