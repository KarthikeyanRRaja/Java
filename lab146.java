import java.io.FileInputStream;
import java.io.*;

public class lab146 {
	public static void main(String args[]){  
		  try{  
		    FileInputStream fin=new FileInputStream("abc.txt");
		    BufferedInputStream bin=new BufferedInputStream(fin);
		    int i=0;  
		    while((i=fin.read())!=-1){  
		     System.out.print((char)i);  
	    }  
		    
		    bin.close();
		    fin.close();  
		  }catch(Exception e){System.out.println(e);}  
		 }  
}
