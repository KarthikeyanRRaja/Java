
public class lab128 implements Runnable{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String sr[])
	{
		lab127 g=new lab127();
		lab127 g1=new lab127();
		Thread t=new Thread(g);
		Thread t1=new Thread(g1);
		t.start();
		t1.start();
	}
}
