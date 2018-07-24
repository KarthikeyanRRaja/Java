/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex56;

/**
 *
 * @author Karthikeyan
 */
public class Ex56 {

    /**
     * @param args the command line arguments
     */
    public static int result(int x, int y, int p) {	
		if (x%p == 0)
			return( y/p - x/p + 1);
		return(y/p - x/p);
	}
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5;
		int y = 20;
		int p = 3;
		System.out.println(result(x,y,p));
    }
    
}
