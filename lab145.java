import java.io.BufferedOutputStream;
import java.io.FileOutputStream;


public class lab145 {
	public static void main(String args[]){  
		   try{  
	     FileOutputStream fout=new FileOutputStream("abc.txt");
	     BufferedOutputStream bout=new BufferedOutputStream(fout);
	     String s="MS Dhoni is my favourite player";  
		     byte b[]=s.getBytes();//converting string into byte array  
		     bout.write(b);
		     bout.flush();
		     bout.close();
		     fout.close();  
		     System.out.println("success...");  
		    }catch(Exception e){System.out.println(e);}  
		  }  
}
