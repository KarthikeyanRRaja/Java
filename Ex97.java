/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex97;

/**
 *
 * @author Karthikeyan
 */
public class Ex97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array_nums = {10, 20, 10, 50, 20, 13, 50};
	//int[] array_nums = {10, 10, 50, 50, 20, 13, 50};
      boolean testd = false;
	  int result=0;
	  int x = 10;
	      
	for(int i = 0; i < array_nums.length - 1; i++) {
        if(array_nums[i] == x && array_nums[i+1] == x)
            {
         System.out.printf( String.valueOf(true));	
         result = 1 ;
		}
                  
        if(i <= array_nums.length - 3 && array_nums[i] == x && array_nums[i+2] == x)
           {
         System.out.printf( String.valueOf(true));	
         result = 1 ;
		}
    }
	
	 if (result==0)                             
	   {	 
         System.out.printf( String.valueOf(false));
	    }
		System.out.printf("\n");

    }
    
}
