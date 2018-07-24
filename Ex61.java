/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex61;

/**
 *
 * @author Karthikeyan
 */
public class Ex61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name="RIT";
        char[] ch=name.toCharArray();
        for(int i=name.length()-1;i>=0;i--)
        {
            System.out.println(ch[i]);
        }
    }
    
}
