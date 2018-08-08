
public class lab118 extends Thread{
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
		lab118 g=new lab118();
		lab118 g1=new lab118();
		//Thread t=new Thread(g);
		g.start();
		g1.start();
	}
}
