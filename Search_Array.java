/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtusa_3;
import java.util.*;
/**
 *
 * @author Karthikeyan
 */
public class Search_Array {
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int i,n,ser,c=0;
       System.out.println("Enter the size of array=");
       n=s.nextInt();
       int arr[]=new int[n];
       for(i=0;i<n;i++)
       {
           arr[i]=s.nextInt();
       }
       System.out.println("Enter the Search Element=");
       ser=s.nextInt();
       for(i=0;i<n;i++)
       {
           if(arr[i]==ser)
           {
               System.out.println("Value is present");
               c=1;
               break;
           }
       }
       if(c==0)
       {
           System.out.println("Not Present");
       }
    }
}
