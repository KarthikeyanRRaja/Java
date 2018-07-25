/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex98;

/**
 *
 * @author Karthikeyan
 */
public class Ex98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array_nums = {10, 20, 10, 20, 40, 13, 20};
		
	int count = 0, result =0;
    
    if(array_nums.length >= 1 && array_nums[0] == 20)
        count++;

    for(int i = 1; i < array_nums.length; i++) {
        if(array_nums[i - 1] == 20 && array_nums[i] == 20)
		{
         System.out.printf( String.valueOf(false));	
         result = 1;
		}                   
        if(array_nums[i] == 20)
            count++;
    }
                                          
    if (result==0)
 	  {
     	 System.out.printf( String.valueOf(count == 3));	         
	  }	
	  System.out.printf("\n");	
    }
    
}
