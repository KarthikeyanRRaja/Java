class operation
{
	int data=50;
void change(int data)
{
this.data=data+100;	
}
}
public class lab64 {

public static void main(String ar[])
{
	operation op=new operation();
	System.out.println(op.data);
	op.change(500);
	System.out.println(op.data);
}
}



