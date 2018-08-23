
public class odd_even_thread extends Thread{
	public void run1()
	{
		for(int i=0;i<=100;i++)
		  {
		try
		{
		  
			if(i%2==0)
			{
				System.out.println(i);
			}
		//System.out.println("Thread is running");
	}
		
	
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		//System.out.println("Thread is running");
	}
	}
	public static void main(String sr[])
	{
		odd_even_thread g=new odd_even_thread();
		g.run1();
	}
}
