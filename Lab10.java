/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author Karthikeyan
 */
public class Lab10 {

    /**
     * @param args the command line arguments
     */
    void sum(int a,int b)
    {
        System.out.println("The Sum for two arguments="+(a+b));
    }
     void sum(double a,double b,double c)
    {
        System.out.println("The Sum for three arguments="+(a+b+c));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Lab10().sum(1, 2);
        new Lab10().sum(1, 2, 3);
    }
    
}
