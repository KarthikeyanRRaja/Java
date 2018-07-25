/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;
import java.util.*;

/**
 *
 * @author Karthikeyan
 */
public class Lab13 {

    /**
     * @param args the command line arguments
     */
     int rno;
    String name;
    Lab13()
            {
                
            }
    Lab13(int rno,String name)
    {
        System.out.println(rno+" "+name);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Lab13 n=new Lab13();
        Scanner  s=new Scanner(System.in);
        System.out.println("Enter the rno and name=");
        n.rno=s.nextInt();
        n.name=s.nextLine();
        Lab13 b=new Lab13(n.rno,n.name);
        
        
        
    }
    
}
