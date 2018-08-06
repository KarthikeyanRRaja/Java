interface inter1
{
	void car();
	void bike();
}
abstract class Abs implements inter1
{
	public void car()
	{
		System.out.println("I bought a BMW Car");
	}
}
 class rk extends Abs{
	/*public void car()
	{
		System.out.println("The second car which I bought is Benz");
	}*/
	public void bike()
	{
		System.out.println("The bike which I bought is Ducati");
	}

}
 public class lab49 
 {
	 public static void main(String ar[])
	 {
		 inter1 s=new rk();
         s.car();
         s.bike();
		 
	 }
 }
