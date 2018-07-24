/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex42;
import java.io.Console;
/**
 *
 * @author Karthikeyan
 */
public class Ex42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        Console cons;
		if ((cons = System.console()) != null) {
			char[] pass_ward = null;
			try {
				pass_ward = cons.readPassword("Input your Password:");
				System.out.println("Your password was: " + new String(pass_ward));
			} finally {
				if (pass_ward != null) {
					java.util.Arrays.fill(pass_ward, ' ');
				}
			}
		} else {
			throw new RuntimeException("Can't get password...No console");
		}
    }
}
    

