
public class stativc_method {
static String clg="RIT";
int c,d;
static void fun()
{
	clg="IT";
	System.out.println(clg);
}
stativc_method(int a,int b)
{
     c=a;
	 d=b;
}
void disp()
{
	System.out.println(clg+"\n"+c+"\n"+d);
}
public static void main(String sr[])
{
	fun();
	stativc_method s=new stativc_method(10,20);
	s.disp();
}

}
