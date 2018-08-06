
 class bank1 {
	void get()
	{
		System.out.println("HI I am BANK");
	}
}  
class SBI1 extends bank1
{
	void get()
	{
		System.out.println("HI I am SBI");
	}   
  }
class ICICI1 extends SBI1
{
void get()
{
	System.out.println("HI I am ICICI");
}
}
class kvb1 extends ICICI1
{
void get()
{
	System.out.println("HI I am KVB BANK");
}
}
public class lab40
{
  public static void main(String args[]){  
   bank b=new bank();
   bank b1=new SBI();
   bank b2=new ICICI();
   bank b3=new kvb();
   b.get();
   b1.get();
   b2.get();
   b3.get();
}  



}
