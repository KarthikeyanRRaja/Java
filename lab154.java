import java.io.PrintStream;
import java.util.*; 
import java.io.*;
public class lab154 {
public static void main(String ar[])
{
	FileOutputStream fout=new FileOutputStream("kk.txt");
	PrintStream out=new PrintStream(fout);
	int a=20;
	System.out.printf("%d",a);
}
}
