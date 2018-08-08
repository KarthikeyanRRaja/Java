
public class lab121 extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String sr[])
	{
		lab121 g=new lab121();
		lab121 g1=new lab121();
		g.start();
		g1.start();
	}
}
