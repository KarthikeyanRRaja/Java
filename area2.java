package p;
import area.*;
public class area2 {
	final int a=0;
	public static void main(String ar[])
	{ area2 v=new area2();
		area1 n=new area1();
		n.square(5);
		n.rect(12, 32);
		System.out.println(n instanceof area1);
		System.out.println(v.a++);
	}

}
