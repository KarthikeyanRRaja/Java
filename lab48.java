interface printable
{
	void print();
}
public class lab48 implements printable {
	public void print()
	{
		System.out.println("I am interface method");
	}
	public static void main(String ar[])
	{
		lab48 v=new lab48();
		v.print();
	}
	
	

}
