
public class current_class {
	void add()
	{
	System.out.println("HI I am Invoked");
	}
	void sub()
	{
		add();
	}
	public void mul()
	{
		sub();
	}
	public static void main(String ar[])
	{
		new current_class().mul();
	}

}
