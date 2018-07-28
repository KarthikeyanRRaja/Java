package construct;
import java.util.*;
public class stud {
	int id;
	String name;
	void stu(stud g)
	{
		this.id=id;
		System.out.println(id);
	}
	
stud(int i,String name)
{
//this(i);
this.name=name;
}
public void disp(int ab)
{
System.out.println(ab);	
stu(this);
}
public static void main(String ar[])
{int a;
	//stud s=new stud();
	stud s1=new stud(25,"karthi");
	Scanner L=new Scanner(System.in);
	a=L.nextInt();
	s1.disp(5);
	//s1.stu(6);
}

}
