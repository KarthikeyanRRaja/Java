/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex37;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String=");
        String name=s.nextLine();
        int i;
        for(i=name.length()-1;i>=0;i--)
        {
            System.out.println(" "+name.charAt(i));
        }
    }
    
}
