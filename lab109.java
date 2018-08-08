
public class lab109 {
	static void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("not valid");
		else
		{
			System.out.println("Valid to vote");
		}
	}
	public static void main(String ar[])
	{
		validate(15);
		
	}

}
