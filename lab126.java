class Mythread extends Thread
{
	public void run(){
		System.out.println("Shutdown Hook task was completed");
	}
}
public class lab126 {
public static void main(String s[]) throws Exception 
{
	Runtime r=Runtime.getRuntime();
	r.addShutdownHook(new Mythread());
	System.out.println("Press ctrl+c to exit.");
	try
	{
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
