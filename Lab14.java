/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

import java.util.Scanner;

/**
 *
 * @author Karthikeyan
 */
public class Lab14 {

    /**
     * @param args the command line arguments
     */
     int rno;
    String name;
    Lab14()
            {
               System.out.println("HI Karthi");
            }
    Lab14(int rno,String name)
    {
        System.out.println(rno+" "+name);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Lab14 n=new Lab14();
        Scanner  s=new Scanner(System.in);
        System.out.println("Enter the rno and name=");
        n.rno=s.nextInt();
        n.name=s.nextLine();
        Lab14 b=new Lab14(n.rno,n.name);
        
    }
    
}
