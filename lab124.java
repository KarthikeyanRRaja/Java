import java.util.*;
public class lab124 implements Runnable{
	private String msg;
	public lab124(String s)
	{
		this.msg=s;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"Start Message="+msg);
		processmessage();
		System.out.println(Thread.currentThread().getName()+"END");
	}
	private void processmessage()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String ar[])
	{
		lab124 p=new lab124("Karthi");
		lab124 p1=new lab124("Velan");
		Thread t=new Thread(p);
		Thread t1=new Thread(p1);
		t.start();
		try
		{
			t.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t1.start();
		
	}

}
