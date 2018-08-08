
public class lab107 {
	public static void main(String ar[])
	{
		try
		{
			int a=10/0;	
			int[] b=new int[5];
			b[8]=a;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
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
