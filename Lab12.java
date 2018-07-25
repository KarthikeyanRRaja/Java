/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author Karthikeyan
 */
public class Lab12 {

    /**
     * @param args the command line arguments
     */
    int rno;
    String name;
    Lab12()
    {
        System.out.println(rno+" "+name);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Lab12 l=new Lab12();
        l.rno=25;
        l.name="karthi";
    }
    
}
