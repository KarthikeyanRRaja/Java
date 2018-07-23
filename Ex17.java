/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex17;

/**
 *
 * @author Karthikeyan
 */
public class Ex17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=10,b=11,n,ab,count=0;
        String x="";
        n=a|b;
        System.out.println("The Binary Sum is "+n);
        while(n > 0)
        {
            ab = n % 2;
            if(ab == 1)
            {
                count++;
            }
            x = x + "" + ab;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
        
    }
    
}
