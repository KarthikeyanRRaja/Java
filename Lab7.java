/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Karthikeyan
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    void sum(int a,int b)
    {
        System.out.println("The Sum for two arguments="+(a+b));
    }
     void sum(int a,int b,int c)
    {
        System.out.println("The Sum for three arguments="+(a+b+c));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Lab7 a=new Lab7(),b=new Lab7();
        a.sum(10, 20);
        b.sum(10,20,30);
    }
    
}
