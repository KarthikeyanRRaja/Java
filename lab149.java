import java.io.FileOutputStream;
import java.io.*;

public class lab149 {
	public static void main(String args[]){  
		   try{  
	     CharArrayWriter fout=new CharArrayWriter();  
	     String s="Sachin Tendulkar is my favourite player";  
		    // byte b[]=s.getBytes();//converting string into byte array  
		     fout.write(s);
		     FileWriter f1=new FileWriter("a.txt");
		     FileWriter f2=new FileWriter("b.txt");
		     
		     fout.writeTo(f1);
		     fout.writeTo(f2);
		     fout.close();  
		     System.out.println("success...");  
		    }catch(Exception e){System.out.println(e);}  
		  }  
}
