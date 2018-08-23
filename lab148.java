import java.io.FileOutputStream;
import java.io.*;

public class lab148 {
	public static void main(String args[]){  
		   try{  
	     FileReader fin=new FileReader("fw.txt");    
		     //byte b[]=s.getBytes();//converting string into byte array  
		       int i;
		       while((i=fin.read())!=-1)
		       {
		    	   System.out.print((char)i);
		       }
		     fin.close();  
		     System.out.println(" success...");  
		    }catch(Exception e){System.out.println(e);}  
		  }  
}
