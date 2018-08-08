
public class lab117 implements Runnable{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String sr[])
	{
		lab116 g=new lab116();
		Thread t=new Thread(g);
		t.run();
	}

}
