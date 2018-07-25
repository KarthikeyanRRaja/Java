/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex99;

/**
 *
 * @author Karthikeyan
 */
public class Ex99 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array_nums = {10, 20, 10, 20, 40, 20, 50};
	int result = 0;	
	int x = 20;
	for(int i = 0; i < array_nums.length - 1; i++) {
        if(array_nums[i] != x && array_nums[i + 1] != x)
		{
                                result = 1;	
		}        
    }                                   
    if (result==0)
 	  {
     	 System.out.printf( String.valueOf(true));	         
	  }
 else
	   	  {
     	 System.out.printf( String.valueOf(false));	         
	  }		
    }
    
}
