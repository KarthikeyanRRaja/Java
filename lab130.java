
public class lab130 extends Thread{
	public void finalize()
	{
		System.out.println("Object is garbage Collected");
	}
	public static void main(String sr[])
	{
		lab130 g=new lab130();
		lab130 g1=new lab130();
		g=null;
		g1=null;
		System.gc();
	}
}
