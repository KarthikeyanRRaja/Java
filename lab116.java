
public class lab116 extends Thread{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String sr[])
	{
		lab116 g=new lab116();
		g.run();
	}

}
