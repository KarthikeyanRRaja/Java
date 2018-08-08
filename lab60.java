

public class lab60 {
	public static void main(String ar[])
	{
		char[] name={'a','b','c','d','e','f','g','h','i','j','k','l'};
		char[] toname=new char[7];
		System.arraycopy(name, 2, toname, 0, 7);
		System.out.println(new String(toname)+" ");
	}

}
