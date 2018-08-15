import java.io.*;
import java.net.*;
public class server {
public static void main(String ar[])
{
	try
	{
		ServerSocket s=new ServerSocket(5555);
		Socket s1=s. accept();
		DataInputStream k=new DataInputStream(s1.getInputStream());
		
		String str=(String)k.readUTF();
		String str1=k.readUTF();
		System.out.println("Message=:"+str);
		System.out.println("Sum="+str1);
		
	}
	catch(Exception e)
	{
		
		
	}
}
}


