import java.io.*;
public class lab150 {
public static void main(String ar[]) throws IOException
{
	InputStreamReader r=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(r);
	String name;
	System.out.println("Enter your name=");
	name=br.readLine();
	System.out.println("hi"+" "+name);
}
}
