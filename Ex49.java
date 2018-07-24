/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex49;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value=");
        n=s.nextInt();
        if(n%2==0)
        {
            System.out.print("\n1");
        }
        else
        {
            System.out.print("\n0");
        }
        
    }
    
}
