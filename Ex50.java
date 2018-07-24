/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex50;

/**
 *
 * @author Karthikeyan
 */
public class Ex50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        System.out.println("Divisible by 3");
        for(i=1;i<=100;i++)
        {
            if(i%3==0)
            {
                System.out.print(i+",");
            }
        }
        System.out.print("\n");
        System.out.println("Divisible by 5");
        for(i=1;i<=100;i++)
        {
            if(i%5==0)
            {
                System.out.print(i+",");
            }
        }
        System.out.print("\n");
        System.out.println("Divisible by 3 and 5");
        for(i=1;i<=100;i++)
        {
            if((i%3==0)&&(i%5==0))
            {
                System.out.print(i+",");
            }
        }
    }
    
}
