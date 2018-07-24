/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex38;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner s=new Scanner(System.in);
       String a="I how are you 1?";
        char name[]=a.toCharArray();
        int space=0,character=0,digit=0,others=0;
        for(int i=0;i<a.length();i++)
        {
            if(Character.isLetter(name[i]))
            {
                character++;
            }
            else if(Character.isDigit(name[i]))
            {
                digit++;
            }
            else if(Character.isSpaceChar(name[i]))
            {
                space++;
            }
            else
            {
                others++;
            }
            
                
        }
        System.out.println(space);
        System.out.println(character);
        System.out.println(digit);
        System.out.println(others);
    }
    
}
