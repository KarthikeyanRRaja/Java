abstract class animal2
	{
		abstract void get();
		animal2()
		{
			System.out.println("Hi I am Abstract constructor");
		}
		void changed()
		{
			System.out.println("Hi I am abstract method ");
		}
	}
	
	public class lab46 extends animal2 {
	  void get()
		{
			System.out.println("Running Successfully");
		}
		public static void main(String ar[])
		{
			animal2 l=new lab46();
	        l.get();
	        l.changed();
		}
}
