/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex93;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = {10, 10, 2, 4, 20, 20};  
	int ctr_even = 0, ctr_odd = 0;
	System.out.println("Original Array: "+Arrays.toString(nums)); 
	    
    boolean found1010 = false;
    boolean found2020 = false;
      
    for(int i = 0; i < nums.length - 1; i++) {
        if(nums[i] == 10 && nums[i+1] == 10)
            found1010 = true;
                        
        if(nums[i] == 20 && nums[i+1] == 20)
            found2020 = true;
    }
   
	System.out.printf( String.valueOf(found1010 != found2020));	
	System.out.printf("\n");
    }
    
}
