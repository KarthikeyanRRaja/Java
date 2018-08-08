class stud1
	{
		int rno;
		String name;
		stud1(int rno,String name)
		{
			this.rno=rno;
			this.name=name;
		}
		public String toString()
		{
			return rno+" "+name;
		}
	}
public class lab97 {
	
	public static void main(String ar[])
	{
		stud1 s=new stud1(25,"karthi");
		System.out.println(s);
	}
}
