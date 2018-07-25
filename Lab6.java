/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Karthikeyan
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    int len;
    int width;
    void fun(int l,int w) 
    {
        len=l;
        width=w;
    }
    void show()
    {
        System.out.println(len*width);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
         Lab6 a=new Lab6(), a1=new Lab6();
        a.fun(4,15);
        a1.fun(5,16);
        a.show();
        a1.show();
 
    }
    
}
