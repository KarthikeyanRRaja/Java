class thread1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
class thread2 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
public class lab129 {
	public static void main(String sr[])
	{
		thread1 g=new thread1();
		thread2 g1=new thread2();
		g.start();
		g1.start();
	}
}
