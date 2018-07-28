
public class this_param {
	void kar(this_param s )
	{
	  System.out.println("Method invoked");
	}
	void par()
	{
		kar(this);
	}
	public static void main(String ar[])
	{
		new this_param().par();
		
	}

}
