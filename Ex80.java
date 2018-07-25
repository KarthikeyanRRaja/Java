/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex80;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] array_nums = {20, 30, 40};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int[] new_array_nums = {array_nums[1], array_nums[2], array_nums[0]};
	System.out.println("Rotated Array: "+Arrays.toString(new_array_nums)); 	
    }
    
}
