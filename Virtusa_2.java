/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtusa_2;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
class Swap
{
    public int t,a,b;
    public void ans(int a,int b)
    {
        this.a=b;
        this.b=a;
        System.out.println("A= "+this.a+" "+"B= "+this.b);
    }
    
}
public class Virtusa_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner s=new Scanner(System.in);
       int a,b;
       System.out.println("Enter the A and B value=");
       a=s.nextInt();
       b=s.nextInt();
       new Swap().ans(a,b);
       
    }
    
}
