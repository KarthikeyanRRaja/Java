import java.io.IOException;
public class lab110 {
	void m() throws IOException
	{
		throw new IOException("Device Error");
	}
	void n() throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
public static void main(String ar[])
{
	lab110 l=new lab110();
	l.p();
}
}
