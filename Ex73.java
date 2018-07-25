/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex73;

/**
 *
 * @author Karthikeyan
 */
public class Ex73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String str1 = "Python"; 
	String str2 = ""; 
	
	int length2 = str2.length();
	String result = "";
	result += (str1.length() >= 1) ? str1.charAt(0) : '#';
	result += (length2 >= 1) ? str2.charAt(length2-1) : '#';
	System.out.println(result);
    }
    
}
