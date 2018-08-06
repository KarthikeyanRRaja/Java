import java.util.*;
 class bike5 {
	void display()
	{
		System.out.println("Welcome To IT Department");
	}
	
}  
class lab34 extends bike5
{
  int speed=100;  
  void display(){  
	  super.display();
   System.out.println("Welcome to JAVA Programming");//will print speed of Bike   
  }  
  public static void main(String args[]){  
   lab34 b=new lab34();  
   b.display();  
}  

}
