
public class lab108 {
	public static void main(String ar[])
	{
		try
		{
		try
		{
			int a=10/0;	
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		try
		{
			int[] b=new int[5];
			b[8]=8;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		
		}
		catch(Exception h)
		{
			System.out.println(h);
		}
		finally
		{
			System.out.println("All the codes are executed");
		}
	}

}
