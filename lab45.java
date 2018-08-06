abstract class animal1
	{
		abstract void get();
	}
	public class lab45 extends animal1 {
	  void get()
		{
			System.out.println("Running Successfully");
		}
		public static void main(String ar[])
		{
			animal1 l=new lab45();
			l.get();
		}
}
