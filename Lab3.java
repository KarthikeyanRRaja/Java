/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Karthikeyan
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    int rno;
    String name;
    void fun(int roll_no,String na) 
    {
        rno=roll_no;
        name=na;
    }
    void show()
    {
        System.out.println("ROLL NO:"+rno);
        System.out.println("ROLL NO:"+name);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Lab3 a=new Lab3();
        Lab3 a1=new Lab3();
        a.fun(25,"karthi");
        a1.fun(16,"Dinesh");
        a.show();
        a1.show();
    }
    
}
