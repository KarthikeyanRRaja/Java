
public class with_static {
static int count=0;
with_static()
{
	System.out.println(count++);
}
public static void main(String ar[])
{
	with_static n=new with_static();
	with_static n1=new with_static();
	with_static n2=new with_static();
	
}
}
