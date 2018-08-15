import java.net.*;
import java.util.*;  
import java.io.*;  
public class chat_server {
		
		 
		public static void main(String args[])throws Exception{  
		ServerSocket ss=new ServerSocket(3337);  
		Socket s=ss.accept();  
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		FileOutputStream st=new FileOutputStream("chat_server.txt");
		  
		String str="",str2="";  
		while(!str.equals("stop")){ 
			byte b[]=str.getBytes();
		str=din.readUTF();  
		System.out.println("client says: "+str+" "+new Date());  
		st.write(b);
		str2=br.readLine();  
		dout.writeUTF(str2);  
		dout.flush();  
	}  
		din.close();  
		s.close();  
		ss.close();  
	}}


