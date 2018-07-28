
public class construct_call {
	int id;
	String name;
	construct_call(int id,String name,String city)
	{
		this(id,name);
		this.id=id;
		this.name=name;
		String cit=city;
		
	}
	construct_call(int id,String name)
	{
		System.out.println(id+"\n"+name);
	}
public static void main(String ar[])
{
	construct_call c=new construct_call(10,"karthi","chennai");
}
}
