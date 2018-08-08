
public class lab119 extends Thread {
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
		System.out.println("Thread is terminated");
	}
	public static void main(String sr[])
	{
		lab119 g=new lab119();
		lab119 g1=new lab119();
		lab119 g2=new lab119();
		//Thread t=new Thread(g);
		g.start();
		try
		{
			g.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		g1.start();
		//g2.start();
	}
}
