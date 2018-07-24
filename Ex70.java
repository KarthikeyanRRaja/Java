/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex70;

/**
 *
 * @author Karthikeyan
 */
public class Ex70 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1="Java";
        String str2="Ji";
        String str3="Tutorials";
        int len1=str1.length();
        int len2=str2.length();
        int len3=str3.length();
        if((len1!=len2)&&(len1!=len3)&&(len2!=len3))
        {
            System.out.println(str1+str2+str3);
        }
    }
    
}
