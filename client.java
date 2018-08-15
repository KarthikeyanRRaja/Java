
	import java.io.*;
	import java.net.*;
public class client {
	
	//public class Myserver {
	public static void main(String ar[])
	{
		try
		{
			int a=10,b=20,c;
			c=a+b;
			//ServerSocket s=new ServerSocket(5555);
			Socket s1=new Socket("localhost",5555);
			DataOutputStream k=new DataOutputStream(s1.getOutputStream());
			k.writeUTF("Hello Server");
			k.writeInt(c);
			k.flush();
			k.close();
			s1.close();
			
		}
		catch(Exception e)
		{
			
			System.out.println(e);
		}
	}
	}




