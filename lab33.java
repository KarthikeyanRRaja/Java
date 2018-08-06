
 class bike4 {
	//int speed=50;
	 bike4()
	 {
		 System.out.println("Vehicle is created");
	 }
}  
public class lab33 extends bike4{  
  //int speed=100;  
  lab33(){
	  super();
   System.out.println("The vehicle which is created is BIKE");//will print speed of Bike   
  }  
  public static void main(String args[]){  
   lab33 b=new lab33();  
   
}  


}
