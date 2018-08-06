
public class lab43 {
	 void get(lab43 l)
	{
		System.out.println(l instanceof lab43);
	}
	public static void main(String ar[])
	{
		lab43 l=new lab43();
		l.get(l);
	}
}
