/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex96;

/**
 *
 * @author Karthikeyan
 */
public class Ex96 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] array_nums = {10, 70, 80, 50, 20, 13, 50};
      boolean testd = false;
	  int result=0;
	  int x = 10;
	  int y = 20;
    
    for(int i = 0; i < array_nums.length; i++) {
        if(array_nums[i] == x)
            testd = true;
                    
        if(testd && array_nums[i] == y)
		{
         System.out.printf( String.valueOf(true));	
         result = 1		 ;
		}
    }
     if (result==0)                             
	   {	 
         System.out.printf( String.valueOf(false));
	    }
		System.out.printf("\n");
    }
}
    

