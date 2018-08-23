import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;


public class lab144 {
	public static void main(String args[])throws Exception{  
		   FileInputStream fin1=new FileInputStream("f1.txt");  
		   FileInputStream fin2=new FileInputStream("f2.txt");  
		   FileOutputStream fout=new FileOutputStream("ff.txt");
		   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);  
		   int i;  
		   while((i=sis.read())!=-1){  
		    fout.write(i);  
		   }  
		   sis.close();  
		   fin1.close();  
		   fin2.close();  
		  }  
}
