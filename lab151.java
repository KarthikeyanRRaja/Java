import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;


public class lab151 {
	public static void main(String ar[]) 
	{
		//InputStreamReader r=new InputStreamReader(System.in);
		//BufferedReader br=new BufferedReader(r);
		Console c=System.console();
		String name;
		System.out.println("Enter your name=");
		name=c.readLine();
		System.out.println("hi"+" "+name);
	}
}
