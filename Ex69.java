/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex69;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Ex69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name="python";
        char[] ch=name.toCharArray();
        int len=name.length();
        len=(len-1)/2;
        for(int i=0;i<=len;i++)
        {
            System.out.println(ch[i]);
        }
    }
    
}
