
public class lab120 extends Thread{
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Thread is running");
	}
	public static void main(String sr[])
	{
		lab120 g=new lab120();
		lab120 g1=new lab120();
		lab120 g2=new lab120();
	    System.out.println("Name of g:"+g.getName());
	    System.out.println("Name of g1:"+g1.getName());
	    System.out.println("Name of g2:"+g2.getName());
	    g.setName("Karthi");
	    g.start();
	    g1.start();
	    System.out.println("Now Name of g:"+g.getName());
	    
	}

}
