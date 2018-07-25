/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex102;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array_nums = {11, 11, 13, 31, 45, 20, 33, 53};
    int result = 1; 
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	
	for(int i = 0; i < array_nums.length; i++)
     {
      	if(array_nums[i] == 10 || array_nums[i] == 30)
		{	
  		
		   result =0;
		}
      }
	 if (result==1)
 	   System.out.printf( String.valueOf(false));	         
     else
	   System.out.printf(String.valueOf(true));
    }
    
}
