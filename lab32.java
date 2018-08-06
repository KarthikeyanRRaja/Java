
 class bike3 {
	int speed=50;  
}  
class lab32 extends bike3
{
  int speed=100;  
  void display(){  
   System.out.println(super.speed);//will print speed of Bike   
  }  
  public static void main(String args[]){  
   lab32 b=new lab32();  
   b.display();  
}  

}
