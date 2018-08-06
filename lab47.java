interface getting
{
	void get(int a);
}
interface putting
{
	void put();
}
public class lab47 implements getting,putting {
	int c;
	public void get(int a)
	{
		c=a;
	}
	public void put()
	{
		System.out.println("The value passed is "+c);
	}
	public static void main(String ar[])
	{
		lab47 b=new lab47();
		b.get(10);
		b.put();
	}

}
