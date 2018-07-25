/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex91;

/**
 *
 * @author Karthikeyan
 */
public class Ex91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long startTime = System.nanoTime(); 
	// Sample program
	// Display the first 10 natural numbers.
	int i;
	System.out.println ("The first 10 natural numbers are:\n");
	for (i=1;i<=10;i++)
	{      
		System.out.println (i);
	}
		long estimatedTime = System.nanoTime() - startTime;
	System.out.println("Estimated time (in nanoseconds) to get the first 10 natural numbers: "+estimatedTime);
    }
    
}
