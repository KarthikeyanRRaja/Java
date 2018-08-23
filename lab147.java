import java.io.FileOutputStream;
import java.io.*;

public class lab147 {
	public static void main(String args[]){  
		   try{  
	     FileWriter fout=new FileWriter("fw.txt");  
	     String s="Information Technology";  
		     //converting string into byte array  
		     fout.write(s);  
		     fout.close();  
		     System.out.println("success...");  
		    }catch(Exception e){System.out.println(e);}  
		  }  
}
