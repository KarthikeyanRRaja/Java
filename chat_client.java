	import java.net.*;  
import java.util.Date;
		import java.io.*;  
	
public class chat_client {
		  
		public static void main(String args[])throws Exception{  
		Socket s=new Socket("localhost",3337);  
		Date d=new Date();
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		FileOutputStream st=new FileOutputStream("chat_client.txt");
		PrintWriter p=new PrintWriter(st);
		String str="",str2="";  
	while(!str.equals("stop")){  
		byte b[]=str.getBytes();
		str=br.readLine();  
		dout.writeUTF(str); 
		st.write(b);
	dout.flush();  
		str2=din.readUTF();  
		System.out.println("Server says: "+str2+" "+new Date());  
		}  
		  
		dout.close();  
		s.close();  
		}}  


