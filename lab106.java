
public class lab106 {
public static void main(String ar[])
{
	try
	{
		int a=10/0;	
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("All the codes are executed");
	}
}
}
