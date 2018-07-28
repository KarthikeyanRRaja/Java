
public class without_this {
	int a,b;
	without_this(int a,int b)
	{
		a=a;
		b=b;
	}
	void disp()
	{
		System.out.println(a+"\n"+b);
	}
	public static  void main(String ar[])
	{
		without_this s=new without_this(5,2);
		s.disp();
	}

}
