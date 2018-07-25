/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex107;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array_nums = {11, 12, 13, 14, 45, 20};
    System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int result =1;
	
      for(int i = 0; i <= array_nums.length - 3; i++) {
        if(array_nums[i] + 1 == array_nums[i+1] && array_nums[i+1] + 1 == array_nums[i+2])
            result =0;
    }
                
	if (result==1)
	 {
	  System.out.printf(String.valueOf(false));
	 }
	else
	 {
	   System.out.printf(String.valueOf(true));
	 }
	 System.out.printf("\n");
    }
    
}
