/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex18;

/**
 *
 * @author Karthikeyan
 */
public class Ex18 {

    /**
     * @param args the command line arguments
     */
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
    public static void main(String[] args) {
        // TODO code application logic here
        Ex18 v=new Ex18();
        
        int n,a=10,b=11,ab,count=0;
        String x=" ";
        n=(a&b);
     
        System.out.println(n);
          v.decToBinary(n);
       
     
    // driver program
        
    
    }
}

    

