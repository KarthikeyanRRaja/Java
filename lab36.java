
 class bike6 {
	int speed=50;  
	final void run()
	{
		System.out.println("Karthikeyan");
	}
}  
public class lab36 extends bike6
{
  int speed=100;  
  void run(){  
   System.out.println(super.speed);  
  }  
  public static void main(String args[]){  
   lab36 b=new lab36();  
   b.run();  
}  

}
