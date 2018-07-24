/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex40;
import java.nio.charset.Charset;
/**
 *
 * @author Karthikeyan
 */
public class Ex40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("List of available character sets: ");  
    for (String str : Charset.availableCharsets().keySet()) {
      System.out.println(str);
    }
    
    }
}
