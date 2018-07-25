/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex72;

/**
 *
 * @author Karthikeyan
 */
public class Ex72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "";    
	int len = str1.length();
	if(len >= 3)
		System.out.println( str1.substring(0, 3));
	else if(len == 1)
		System.out.println( (str1.charAt(0)+"##"));
	else
		System.out.println("###");
    }
    
}
