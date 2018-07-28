
public class this_construct {
	int id;
	String name;
	this_construct()
	{
		System.out.println("Default constructor is invoked");
	}
	this_construct(int id)
	{
		this();
		this.id=id;
		System.out.println(this.id);
	}
	public static void main(String ar[])
	{
		this_construct t=new this_construct(10);
	}

}
