	import java.io.*;  
	import java.util.zip.*;  

public class lab155 {
		public static void main(String args[]){  
			  
			try{  
			FileInputStream fin=new FileInputStream("abc.txt");  
			  
			FileOutputStream fout=new FileOutputStream("def.java");  
			DeflaterOutputStream out=new DeflaterOutputStream(fout);  
			  
			int i;  
			while((i=fin.read())!=-1){  
			out.write((byte)i);  
			out.flush();  
			}  
			  
			fin.close();  
			out.close();  
			  
			}catch(Exception e){System.out.println(e);}  
			System.out.println("rest of the code");  
			}  

}
