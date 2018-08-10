
public class lab122 extends Thread {
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	public static void main(String sr[])
	{
		lab122 g=new lab122();
		lab122 g1=new lab122();
		g.setPriority(Thread.MIN_PRIORITY);
		g1.setPriority(Thread.MAX_PRIORITY);
		g.start();
		g1.start();
	}
}
