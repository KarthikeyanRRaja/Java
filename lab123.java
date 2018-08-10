
public class lab123 extends Thread{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon is created"+Thread.currentThread().getName());
		}
		else
		{
			System.out.println("User thread works");
		}
	}
	public static void main(String ar[])
	{
		lab123 b=new lab123();
		lab123 b1=new lab123();
		b.setDaemon(true);
		b.start();
		b1.start();
	}

}
