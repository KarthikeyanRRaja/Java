/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex104;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array_nums = {11, 15, 13, 10, 45, 20, 33, 53};
    int result = 0; 
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	
	int l = 0;
	int[] new_array;
	while(array_nums[l] != 10)
	  l++;
	new_array = new int[l];
	for(int i = 0; i < l; i++)
		new_array[i] = array_nums[i];
	System.out.println("New Array: "+Arrays.toString(new_array)); 
    }
    
}
