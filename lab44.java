class animal
{
	
}
public class lab44 extends animal {
  void get(lab44 l)
	{
		System.out.println(l instanceof animal);
	}
	public static void main(String ar[])
	{
		lab44 l=new lab44();
		l.get(l);
	}
}
