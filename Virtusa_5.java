/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtusa_5;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Virtusa_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int i;
        int arr[]=new int[10];
        for(i=0;i<10;i++)
        {
            arr[i]=s.nextInt();
        }
        for(i=0;i<10;i++)
        {
            if(arr[i]==7)
            {
                continue;
            }
            else
                System.out.print(arr[i]+" ");
        }
    }
    
}
