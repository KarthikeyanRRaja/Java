/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakint;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Breakint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int input = in.nextInt();
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
      System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);

    }
    
}
