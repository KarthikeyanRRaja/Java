/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex100;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array_nums1 = {10, 11, 10, 20, 43, 20, 50};
	int[] array_nums2 = {10, 13, 11, 20, 44, 30, 50};
	System.out.println("Array1: "+Arrays.toString(array_nums1)); 
	System.out.println("Array2: "+Arrays.toString(array_nums2)); 
	int ctr = 0;
    
    for(int i = 0; i < array_nums1.length; i++) {
        if(Math.abs(array_nums1[i] - array_nums2[i]) <= 1 && array_nums1[i] != array_nums2[i])
            ctr++;
    }
                    
    System.out.printf("Number of elements: "+ctr);
	System.out.printf("\n");	 
    }
    
}
