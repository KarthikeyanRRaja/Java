/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex83;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String result = "";
	   int[] left_array = {1, 3, -5, 4};
	   int[] right_array = {1, 4, -5, -2};
	   System.out.println("\nArray1: "+Arrays.toString(left_array));  
	   System.out.println("\nArray2: "+Arrays.toString(right_array)); 
       for (int i = 0; i < left_array.length; i++) {
				int num1 = left_array[i];
				int num2 = right_array[i];
				result += Integer.toString(num1 * num2) + " "; 
			}
		System.out.println("\nResult: "+result);     
    }
    
}
