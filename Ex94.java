/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex94;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] array_nums = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
	  
	int i = 0;
    System.out.println("Original Array: "+Arrays.toString(array_nums)); 
    while(i < array_nums.length && array_nums[i] % 2 == 0)
        i++;
              
    for(int j = i + 1; j < array_nums.length; j++) {
        if(array_nums[j] % 2 != 0) {
            int temp = array_nums[i];
            array_nums[i] = array_nums[j];
            array_nums[j] = temp;
            i++;
    }
    
    }
    }
}
