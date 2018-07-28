
public class with_this {
		int a,b;
		with_this(int a,int b)
		{
			this.a=a;
			this.b=b;
		}
		void disp()
		{
			System.out.println(a+"\n"+b);
		}
		public static  void main(String ar[])
		{
			with_this s=new with_this(5,2);
			s.disp();
		}

	}



