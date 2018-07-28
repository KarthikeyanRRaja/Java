
public class without_static {
	int count=0;
	without_static()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String ar[])
	{
		without_static s1=new without_static();
		without_static s2=new without_static();
		without_static s3=new without_static();
	}

}
