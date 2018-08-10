
public class lab127 extends Thread{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String sr[])
	{
		lab127 g=new lab127();
		lab127 g1=new lab127();
		g.start();
		g1.start();
	}
}
