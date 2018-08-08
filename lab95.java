
public class lab95 {
	public static void main(String ar[])
	{
		StringBuffer s1=new StringBuffer();
	     s1.append("Hello");
		System.out.println(s1.capacity());
		s1.append("Java is my favourite language");
		System.out.println(s1.capacity());
		s1.ensureCapacity(10);
		System.out.println(s1.capacity());
		s1.ensureCapacity(50);
		System.out.println(s1.capacity());
	}
}
