/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex19;

/**
 *
 * @author Karthikeyan
 */
public class Ex19 {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[1000];
  
        // counter for binary array
        int i = 0;
        while (n > 0) 
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
  
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
     
    // driver program
    public static void main (String[] args) 
    {
        int n = 17;
        decToBinary(n);
    }
    }
    

